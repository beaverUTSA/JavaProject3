import java.awt.*;
public class Spiral {
  public static void main (String[] args) {
    DrawingPanel panel = new DrawingPanel(300, 300);
    Graphics g = panel.getGraphics();
    int x = 150;
    int y = 150;
    int width = 150;
    int height = 150;
    int startAngle = 150;
    int arcAngle = 150;
    g.drawArc(x, y, width, height, startAngle, arcAngle );
  }
}
