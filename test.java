import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleExample extends JPanel {

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawOval(50, 50, 100, 100); // draws a circle at (50, 50) with width and height of 100
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Circle Example");
    frame.add(new CircleExample());
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}
