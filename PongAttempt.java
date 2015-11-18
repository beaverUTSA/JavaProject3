import java.awt.*;
public class PongAttempt {
  public static final int PANEL_WIDTH =500;
  public static final int PANEL_HEIGHT = 400;
  public static final int SLEEP_TIME = 50;
  public static final int BALL_SIZE = 10;
  public static final Color BALL_COLOR = Color.RED;
  public static final Color BACKGROUND_COLOR = Color.WHITE;
  public static final int ballx = PANEL_WIDTH/2 - BALL_SIZE;
  public static final int bally = PANEL_HEIGHT/2 - BALL_SIZE;
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(PANEL_WIDTH, PANEL_HEIGHT);
    Graphics g = panel.getGraphics( );
    g.setColor(Color.black);
    g.drawString("Project 2 by Brian Biever", 10, 15);
    int ballVelocityX = 1;
    int ballVelocityY = 1;
    startGame(panel, g);
  }
    
  public static void startGame(DrawingPanel panel, Graphics g) {
    int x = 0;
    int y = 270;
    int deltaX = 1;
    int deltaY = -3;
    for (int i = 0; i <= 1000; i++) {
      panel.sleep(SLEEP_TIME);
      drawBall(g,BALL_COLOR, ballx, bally);
    }
  }

  public static void drawBall(Graphics g, Color c, int x,int y) {
    g.setColor(c);
    x = ballx;
    y = bally;
    g.fillOval(ballx, bally, BALL_SIZE, BALL_SIZE);
  }
  
  public static void moveBall(Graphics g){
    //drawBall();
  }
}
