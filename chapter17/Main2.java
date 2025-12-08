import java.awt.FlowLayout;
import javax.swing.*;

public class Main2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("はじめてのSwing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);

    // Widget の定義と追加
    frame.setLayout(new FlowLayout());
    JLabel label = new JLabel("Hello World!!");
    frame.add(label);
    JButton button = new JButton("押してね");
    frame.add(button);

    frame.setVisible(true);
    System.out.println("フレームを表示");
  }
}
