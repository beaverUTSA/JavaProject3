import java.awt.*;

public class CircleLine {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 300);
        Graphics g = panel.getGraphics( );
        drawCircles(panel, g);
    }
    
    public static void drawCircles(DrawingPanel panel, Graphics g) {
        g.setColor(Color.RED); 
        for (int i = 0; i < 10; i++) {
            panel.sleep(500);
            g.fillOval(0 + 30 * i, 270 - 30 * i, 30, 30);
        }
    }
}
