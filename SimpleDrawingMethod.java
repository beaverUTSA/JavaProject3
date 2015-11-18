import java.awt.*;
public class SimpleDrawingMethod {
  public static void main (String[] args) {
    int PANEL_WIDTH = 800;
    int PANEL_HEIGHT = 600;
    drawPanel(PANEL_WIDTH, PANEL_HEIGHT);
  }
  
  public static void drawPanel(int width, int height) {
    DrawingPanel panel = new DrawingPanel(width, height);
    Graphics g = panel.getGraphics();
    int w = width;
    int h = height;
    g.drawRect(50, 50, w -100, h -100);
  }
}
