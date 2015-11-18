import java.awt.*;
public class DrawAndFill {
  public static void main (String[] args) {
    DrawingPanel panel = new DrawingPanel(200, 200);
    Graphics g = panel.getGraphics();
    g.setColor(Color.pink);
    g.fillOval(0, 0, 200, 200);
    g.fillRect(0, 0, 200, 200);
    g.setColor(Color.cyan);
    g.drawString("asthetics", 50, 50);
    g.drawLine(0, 0, 200, 200);
    g.drawOval(0, 0, 200, 200);
    g.drawRect(0, 0, 200, 200);
  }
}
