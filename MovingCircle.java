import java.awt.*;

public class MovingCircle {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 300);
        Graphics g = panel.getGraphics( );
        drawCircles(panel, g);
    }
    
    public static void drawCircles(DrawingPanel panel, Graphics g) {
        for (int i = 0; i <= 90; i++) {
            panel.sleep(50);
            g.setColor(Color.WHITE); 
            g.fillOval(0 + 3 * (i - 1), 270 - 3 * (i - 1), 30, 30);
            g.setColor(Color.RED); 
            g.fillOval(0 + 3 * i, 270 - 3 * i, 30, 30);
        }
    }
}
