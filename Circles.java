import java.awt.*;
public class Circles {
  public static void main (String[] args) {
    DrawingPanel panel = new DrawingPanel(300, 300);
    Graphics g = panel.getGraphics();
    for (int i = 1; i<= 10; i++) {
      g.drawOval(150 - 12*i , 150 - 12*i, 24 * i, 24 * i);
      
    }
  }
}
