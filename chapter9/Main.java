import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Failed to download");
        }

        Connection con = null;
        try {
            // STEP1 Connection to DB
            con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
            // STEP2 SQL
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");
            pstmt.setInt(1, 10); // 最初の?にセット指示
            pstmt.setString(2, "ゾンビ"); // 次の?にセット指示
            int r = pstmt.executeUpdate(); // 与えた指示を基に更新
            if (r != 0) {
                System.out.println(r + "件のモンスターを削除しました");
            } else {
                System.out.println("該当するモンスターなし");
            }
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
