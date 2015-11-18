import java.awt.*;
public class DrawSpiral {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(300,300);
    Graphics g = panel.getGraphics();
    int x = 125;
    int y = 125;
    int width = 0;
    int height = 0;
    int intAngle = 0;
    int arcAngle = 0;
    for (int i=0; i <=10; i++) {
      g.drawArc(7+x-7*i, y-7*i, width+15*i, height+15*i, intAngle+180*i, arcAngle+180);
      i++;
    }
    for(int i=1; i <=10; i++){
      g.drawArc(x-7*i, y-7*i, width+15*i, height+15*i, intAngle+180*i, arcAngle+180);
      i++;
    }
  
  }
}
