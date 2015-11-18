import java.awt.*;

public class Project2 {                                        //This program creates a one-sided Pong game for the user to play
  public static int ballVelocityX;
  public static int ballVelocityY;
  public static int ballx;
  public static int bally;
  public static final Color BACKGROUND_COLOR = Color.WHITE;
  public static final Color BALL_COLOR = Color.RED;
  public static final int BALL_SIZE = 10;
  public static final int KEY_SPACE = ' ';
  public static final Color PADDLE_COLOR = Color.BLACK;
  public static final int PADDLE_LENGTH = 50;
  public static final int PANEL_WIDTH = 500;
  public static int PADDLE_X = PANEL_WIDTH - 40;
  public static final int PANEL_HEIGHT = 400;
  public static int PADDLE_Y = PANEL_HEIGHT/2;
  public static final int SLEEP_TIME = 50;
  public static final int UP_ARROW = 38;
  public static final int DOWN_ARROW = 40;
  public static final int PADDLE_MOVE_AMOUNT = 5;
  public static void main(String[] args) {                               //This main method is in charge of the initial values and display, and starts the game when giving the correct input
    DrawingPanel panel = new DrawingPanel(PANEL_WIDTH, PANEL_HEIGHT);
    Graphics g = panel.getGraphics( );
    g.drawString("Project 2 by Brian Biever", 10, 15);
    ballVelocityX = 0;
    ballVelocityY = 0;
    ballx = PANEL_WIDTH/2 - BALL_SIZE/2;
    bally = PANEL_HEIGHT/2  - BALL_SIZE/2;
    drawBall(g, BALL_COLOR);
    drawPaddle(g, PADDLE_COLOR);
    startGame(panel, g);
  }
  public static void startGame(DrawingPanel panel, Graphics g) {       //This method gives the user control of the paddle and when to start the game, the sleep time, the ball movement and hit detection
    for (int time = 0; time <= 1000; time++) {
      handleKeys(panel, g);
      panel.sleep(SLEEP_TIME);
      moveBall(g);
      detectHit();
    }
  }
  public static void drawBall(Graphics g, Color c) {                  //This method draws a ball of a given color at the current location
    g.setColor(c);
    g.fillOval(ballx, bally, BALL_SIZE, BALL_SIZE);
  }
  public static void moveBall(Graphics g) {                           //This method changes the position and has the rules for panel collisions
    drawBall(g, BACKGROUND_COLOR);
    ballx = ballVelocityX + ballx;
    bally = ballVelocityY + bally;
    drawBall(g, BALL_COLOR);
    if (bally > PANEL_HEIGHT || bally < 0)
      ballVelocityY = -ballVelocityY;
    if (ballx < 0)
      resetBall(g);
    if (ballx > PANEL_WIDTH)
      resetBall(g);
  }
  public static void resetBall(Graphics g) {                          //This method erases the current ball and draws a new one at the center with the variables reset
    drawBall(g, BACKGROUND_COLOR);
    ballx = PANEL_WIDTH/2 - BALL_SIZE/2;
    bally = PANEL_HEIGHT/2  - BALL_SIZE/2;
    ballVelocityX = 1;
    ballVelocityY = 1;
    drawBall(g, BALL_COLOR);
  }
  public static void handleKeys(DrawingPanel panel, Graphics g) {    //This method reads the user input and moves the paddle or reset or start the game
    int keyCode = panel.getKeyCode();
    if (keyCode == KEY_SPACE)
      resetBall(g);
    else if (keyCode == UP_ARROW && (PADDLE_Y - PADDLE_LENGTH/2) > 0)
      movePaddle(g, -PADDLE_MOVE_AMOUNT);
    else if (keyCode == DOWN_ARROW && (PADDLE_Y + PADDLE_LENGTH/2) < PANEL_HEIGHT)
      movePaddle(g, PADDLE_MOVE_AMOUNT);
  }
  public static void drawPaddle(Graphics g, Color c) {                   //This method draws a vertical line of a certain length
    g.setColor(c);
    g.drawLine(PADDLE_X, PADDLE_Y - PADDLE_LENGTH/2, PADDLE_X, PADDLE_Y + PADDLE_LENGTH/2 );
  }
  public static void movePaddle(Graphics g, int deltaY) {                //This method moves the paddle
    drawPaddle(g, BACKGROUND_COLOR);
    PADDLE_Y = deltaY + PADDLE_Y;
    drawPaddle(g, PADDLE_COLOR);
  }
  public static void detectHit() {                                      //This method detects collisions with the ball and the paddle
    if (ballVelocityX > 0 && (bally + BALL_SIZE/2) > (PADDLE_Y - PADDLE_LENGTH/2) && (bally - BALL_SIZE/2) < (PADDLE_Y + PADDLE_LENGTH/2) && (ballx + BALL_SIZE/2) > (PADDLE_X - 6) && (ballx - BALL_SIZE/2) < (PADDLE_X)) {
      ballVelocityX = -ballVelocityX;
    }
  }
}
