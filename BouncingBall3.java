import java.awt.*;

public class BouncingBall3 {
    public static void main(String[] args) {
      int width = 300;
      int height = 800;
      DrawingPanel panel = new DrawingPanel(width, height);
      Graphics g = panel.getGraphics( );
      drawCircles(panel, g, height, width);
    }
    
    public static void drawCircles(DrawingPanel panel, Graphics g, int height, int width) {
      int h = height;
      int w = width;
        int x = 0;
        int y = 270;
        int deltaX = 1;
        int deltaY = -3;
        for (int i = 0; i <= 10; i=+2) {
            panel.sleep(1);
            g.setColor(Color.WHITE); 
            g.fillOval(x, y, w/10, w/10);
            g.setColor(Color.RED); 
            x = x + deltaX;
            y = y + deltaY;
            g.fillOval(x, y, w/10, w/10);
            if (y == 0)
              deltaY = - deltaY;
            if(y == (height - (height/10)))
              deltaY = -deltaY;
            if (x == 0)
              deltaX = -deltaX;
            if (x == (width-(width/10)))
              deltaX = -deltaX;
        }
    }
}
