import java.awt.*;
public class SinglePong {
  public static final int height = 500;
  public static final int width = 400;
  public static final Color white = Color.white;
  public static final Color red = Color.red;
  public static final int size = 10;
  public static void main (String[] args) {
    DrawingPanel panel = new DrawingPanel(height, width);
    Graphics g = panel.getGraphics( );
    int ballx = (height/2) - size;
    int bally = (width/2) - size;
    drawBall(g, panel, red, ballx, bally);
  }
  
  
  public static void drawBall(Graphics g, DrawingPanel panel, Color color, int x, int y) {
    g.setColor(color);
    g.fillOval(x, y, size, size);
  }
}
