import java.awt.*;
public class Hyperbola {                      //This program draws lines to make a Hyperbola
  public static final int PANEL_SIZE = 512;
  public static void main (String[] args) {
    DrawingPanel panel = new DrawingPanel(PANEL_SIZE, PANEL_SIZE);
    Graphics g = panel.getGraphics();
    for (int i = 0; i <= PANEL_SIZE; i++) {
      g.drawLine(0, 0 + 32*i, 0 + 32*i, PANEL_SIZE);
    }
    for (int i = 0; i <= PANEL_SIZE; i++) {
      g.drawLine(0+8*i, 0, PANEL_SIZE, 0+8*i);
    }
  }
}
