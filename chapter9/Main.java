import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Failed to download driver");
        }

        Connection con = null;
        try {
            // STEP1 Connection to DB
            con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
            con.setAutoCommit(false); // 手動コミットモード

            // STEP2 更新系SQL
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");
            pstmt.setInt(1, 10); // 最初の?にセット指示
            pstmt.setString(2, "ゾンビ"); // 次の?にセット指示
            int r = pstmt.executeUpdate(); // 与えた指示を基に更新
            if (r != 0) {
                System.out.println(r + "件のモンスターを削除しました");
            } else {
                System.out.println("該当するモンスターなし");
            }

            // STEP2 検索系SQL
            PreparedStatement pstmt2 = con.prepareStatement("SELECT * FROM MONSTERS WHERE HP >= ?");
            pstmt2.setInt(1, 10);
            ResultSet rs = pstmt2.executeQuery(); // 更新系SQLと異なる点
            while (rs.next()) { // 検索結果の全行を順に処理
                System.out.println(rs.getString("NAME"));
            }

            if (rs.next()) { // 検索結果があるかないかを判定
                System.out.println("ゴブリンのHPは" + rs.getInt("HP"));
            } else {
                System.out.println("ゴブリンはありませんでした");
            }

            rs.close();
            pstmt.close();
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }
}
