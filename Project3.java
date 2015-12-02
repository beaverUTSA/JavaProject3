import java.awt.*;
import java.util.*;
public class Project3 { //Below are all the class constants, and class variables, this program as a whole makes a pong game with a user controlled paddle and computer controlled competition
  public static final int PANEL_WIDTH = 500;
  public static final int PANEL_HEIGHT = 400;
  public static final int SLEEP_TIME = 50;
  public static final int BALL_SIZE = 10;
  public static final int INITIAL_BALL_VELOCITY_X = 4;
  public static final int INITIAL_BALL_VELOCITY_Y = 3;
  public static final int PADDLE_LENGTH = 50;
  public static final int PADDLE_X = PANEL_WIDTH - 40;
  public static final int COMP_PADDLE_X = 40;
  public static final int MAX_COMPUTER_PADDLE_MOVE = 2;
  public static final int COMP_PADDLE_LENGTH = 50;
  public static final Color BALL_COLOR = Color.RED;
  public static final Color BACKGROUND_COLOR = Color.WHITE;
  public static final Color PADDLE_COLOR = Color.BLACK;
  public static final int UP_ARROW = 38;
  public static final int DOWN_ARROW = 40;
  public static final int KEY_SPACE = ' ';
  public static final int KEY_NEW_GAME = 'N';
  public static final int KEY_SCORES = 'S';
  public static final int PADDLE_MOVE_AMOUNT = 5;
  public static final int COMPUTER_SCORE_X = PANEL_WIDTH/3;
  public static final int USER_SCORE_X = PANEL_WIDTH*2/3;
  public static final int SCORES_Y = 50;
  public static final Color SCORE_COLOR = Color.BLUE;
  public static final int SCORES_FONT_SIZE = 30;
  public static final int MAX_SCORES = 5;
  public static final int MIN_X_VELOCITY = 3;
  public static final int MAX_X_VELOCITY = 6;
  public static final int MIN_Y_VELOCITY = -5;
  public static final int MAX_Y_VELOCITY = 5;
  public static int ballX;
  public static int ballY;
  public static int ballVelocityX;
  public static int ballVelocityY;
  public static int paddleY;
  public static int compPaddleY;
  public static int computerScore = 0;
  public static int userScore = 0;
  public static Font normalFont;
  public static Font scoreFont;
  public static Random r = new Random();
  public static int chance;
  public static boolean gameOver = false;
  public static int pauseX;
  public static int pauseY;
  public static int pause = 1;
  public static boolean scoresDisplayed = false;
  public static int[] userScores = new int[11];
  public static int[] computerScores = new int[11];
  public static int gameCount = 0;
  public static int boxWidth = 150;
  public static int boxHeight = 0;
  public static int totalComp =0;
  public static int totalUser =0;
  
  public static void main(String[] args) { // This sets the initial variables, draws the graphics, then starts the game
    DrawingPanel panel = new DrawingPanel(PANEL_WIDTH, PANEL_HEIGHT);
    Graphics g = panel.getGraphics();
    g.drawString("Project 3 Brian Biever",10,15);
    normalFont = g.getFont();
    scoreFont = new Font(normalFont.getName(),normalFont.getStyle(),SCORES_FONT_SIZE);
    g.setFont(scoreFont);
    ballX = PANEL_WIDTH/2;
    ballY = PANEL_HEIGHT/2;
    ballVelocityX = 0;
    ballVelocityY = 0;
    paddleY = PANEL_HEIGHT/2 - PADDLE_LENGTH/2;
    compPaddleY = PANEL_HEIGHT/2 - PADDLE_LENGTH/2;
    drawBall(g,BALL_COLOR);
    drawPaddle(g,PADDLE_COLOR);
    drawComputerPaddle(g, PADDLE_COLOR);
    startGame(panel, g);
  }
  public static void startGame(DrawingPanel panel, Graphics g) { //This loop uses other methods to deal with user input, ball movement, hit detection, the computer controlled paddle, the scoring rules and game functionality
    while(!gameOver) {
      handleKeys(panel,g);
      moveBall(g);
      detectHit();
      drawPaddle(g, PADDLE_COLOR);
      drawScores(g,SCORE_COLOR);
      g.setFont(normalFont);
      g.setColor(PADDLE_COLOR);
      g.drawString("Project 3 Brian Biever",10,15);
      moveComputerPaddle(g);
      panel.sleep(SLEEP_TIME); 
      if (userScore == MAX_SCORES || computerScore == MAX_SCORES) {
        ballVelocityX = 0;
        ballVelocityY = 0;
        if (computerScore == MAX_SCORES){
          g.setFont(scoreFont);
          g.setColor(PADDLE_COLOR);
          g.drawString("COMPUTER WINS", PANEL_WIDTH/4,PANEL_HEIGHT/3-50);
          totalComp++;
        }
        if (userScore == MAX_SCORES){
          g.setFont(scoreFont);
          g.setColor(PADDLE_COLOR);
          g.drawString("USER WINS", PANEL_WIDTH/3,PANEL_HEIGHT/3-50);
          totalUser++;
        }
        userScores[gameCount] = userScore;
        computerScores[gameCount] = computerScore;
        gameCount++;
        gameOver = true;
      }
      if (gameCount == 10){
        gameCount = 0;
        userScores = new int[11];
        computerScores = new int[11];
      }
    }
    while(gameOver){
      handleKeys(panel,g);
      panel.sleep(SLEEP_TIME);
    }
  }
  public static void drawBall(Graphics g, Color c) { // this draws the ball of a certain size with a parameter color
    g.setColor(c);
    g.fillOval(ballX-BALL_SIZE/2,ballY-BALL_SIZE/2,BALL_SIZE,BALL_SIZE);
  }
  public static void moveBall(Graphics g) { // this moves the ball, and resets if it hits the left or right wall
    drawBall(g,BACKGROUND_COLOR);
    ballX += ballVelocityX;
    ballY += ballVelocityY;
    if (ballX > PANEL_WIDTH) {
      resetBall(g);
      addToComputerScore(g);
    }
    if (ballX < 0){
      resetBall(g);
      addToUserScore(g);
    }
    drawBall(g,BALL_COLOR);
  }
  public static void drawPaddle(Graphics g, Color c) { // this draws the users paddle
    g.setColor(c);
    g.drawLine(PADDLE_X,paddleY,PADDLE_X,paddleY+PADDLE_LENGTH);
  }
  public static void handleKeys(DrawingPanel panel, Graphics g) { // this handles user input
    int keyCode = panel.getKeyCode();
    if (keyCode == UP_ARROW)
      movePaddle(g,-PADDLE_MOVE_AMOUNT);
    else if (keyCode == DOWN_ARROW)
      movePaddle(g,PADDLE_MOVE_AMOUNT);
    else if (keyCode == KEY_SPACE)
      resetBall(g);
    else if (keyCode == KEY_NEW_GAME){
      if(gameOver){
        g.setFont(scoreFont);
        g.setColor(BACKGROUND_COLOR);
        g.drawString("USER WINS", PANEL_WIDTH/3,PANEL_HEIGHT/3-50);
        g.drawString("COMPUTER WINS", PANEL_WIDTH/4,PANEL_HEIGHT/3-50);
        drawScores(g,BACKGROUND_COLOR);
        computerScore = 0;
        userScore = 0;
        drawScores(g,SCORE_COLOR);
        gameOver = false;
        startGame(panel, g);
      }
    }else if (keyCode == KEY_SCORES){
      pause = -pause;
      if(pause < 0){
        pauseX = ballVelocityX;
        pauseY = ballVelocityY;
        ballVelocityX = 0;
        ballVelocityY = 0;
        panel.sleep(SLEEP_TIME);
        g.setColor(PADDLE_COLOR);
        for (int i = gameCount-1; i >= 0; i--){
          g.setFont(normalFont);
          g.setColor(PADDLE_COLOR);
          g.drawRect(PANEL_WIDTH/3, PANEL_HEIGHT/3, (PANEL_WIDTH-boxWidth)/2, PANEL_HEIGHT/3 + 15*i -100);
          g.drawString("Computer", PANEL_WIDTH/3, PANEL_HEIGHT/3);
          g.drawString("User", (PANEL_WIDTH+3*boxWidth)/3, PANEL_HEIGHT/3);
          g.drawString("" + userScores[i],PANEL_WIDTH*3/5, PANEL_HEIGHT/3 + 15*i + 30);
          g.drawString("" + computerScores[i],PANEL_WIDTH/3 + 25, PANEL_HEIGHT/3 + 15*i + 30);
          g.drawString("Wins: "+totalUser,(PANEL_WIDTH+3*boxWidth)/3-15, PANEL_HEIGHT/3+15);
          g.drawString("Wins: "+totalComp,PANEL_WIDTH/3+1, PANEL_HEIGHT/3+15);
        }
        scoresDisplayed = true;
      }
      if(pause > 0) {
        ballVelocityX = pauseX;
        ballVelocityY = pauseY;
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(PANEL_WIDTH/3, PANEL_HEIGHT/3 -15, (PANEL_WIDTH-boxWidth)/2+2, PANEL_HEIGHT);
        scoresDisplayed = false;
      }
    }
  }
  public static void movePaddle(Graphics g, int amount) { // this moves the paddle by the given parameter amount
    drawPaddle(g, BACKGROUND_COLOR);
    paddleY += amount;
    if (paddleY < 0)
      paddleY = 0;
    if (paddleY + PADDLE_LENGTH > PANEL_HEIGHT)
      paddleY = PANEL_HEIGHT - PADDLE_LENGTH;
    drawPaddle(g,PADDLE_COLOR);
  }
  public static void detectHit() { // this bounces the ball of the paddles and the top and bottom of the window, and changes the speed depending on impact vector
    if ((ballVelocityX > 0) &&
        (ballY + BALL_SIZE/2 >= paddleY) &&
        (ballY - BALL_SIZE/2 <= paddleY + PADDLE_LENGTH) &&
        (ballX + BALL_SIZE/2 >= PADDLE_X) &&
        (ballX - BALL_SIZE/2 <= PADDLE_X)){
      ballVelocityX = -ballVelocityX;
      if(((paddleY + PADDLE_LENGTH/2) - ballY)>=8){
        ballVelocityY += (((paddleY + PADDLE_LENGTH/2) - ballY)/8);
      }
      if(((paddleY + PADDLE_LENGTH/2) - ballY)<=-8){
        ballVelocityY -= (((paddleY + PADDLE_LENGTH/2) - ballY)/8);
      }
    }
    if ((ballVelocityX < 0) &&
        (ballY + BALL_SIZE/2 >= compPaddleY) &&
        (ballY - BALL_SIZE/2 <= compPaddleY + COMP_PADDLE_LENGTH) &&
        (ballX + BALL_SIZE/2 >= COMP_PADDLE_X) &&
        (ballX - BALL_SIZE/2 <= COMP_PADDLE_X)){
      ballVelocityX = -ballVelocityX;
      ballVelocityX++;
    }
    if ((ballVelocityY < 0) && 
        (ballY - BALL_SIZE/2 <= 0))
      ballVelocityY = -ballVelocityY;
    else if ((ballVelocityY >0) &&
             (ballY + BALL_SIZE/2 >= PANEL_HEIGHT))
      ballVelocityY = -ballVelocityY;
  }
  public static void resetBall(Graphics g) { // this sets the ball back to the center of the window and the speeds to their post initial values
    drawBall(g,BACKGROUND_COLOR);
    ballX = PANEL_WIDTH/2;
    ballY = PANEL_HEIGHT/2;
    chance = r.nextInt(4);
    ballVelocityX = chance + MIN_X_VELOCITY;
    chance = r.nextInt(10);
    ballVelocityY = chance + MIN_Y_VELOCITY;
  }
  public static void drawComputerPaddle(Graphics g, Color c) { // this draws the computers paddle in a certain parameter color
    g.setColor(c);
    g.drawLine(COMP_PADDLE_X,compPaddleY,COMP_PADDLE_X,compPaddleY+COMP_PADDLE_LENGTH);
  }
  public static void moveComputerPaddle(Graphics g) { // this moves the paddle to catch up with the ball
    drawComputerPaddle(g,BACKGROUND_COLOR);
    if (((compPaddleY + COMP_PADDLE_LENGTH/2) - ballY) <= MAX_COMPUTER_PADDLE_MOVE){
      compPaddleY = ballY - COMP_PADDLE_LENGTH/2;
    } else {
      compPaddleY -= MAX_COMPUTER_PADDLE_MOVE;
    }
    drawComputerPaddle(g,PADDLE_COLOR);
  }
  public static void drawScores(Graphics g, Color c) { //this draws the scores in a certain parameter color
    g.setFont(scoreFont);
    g.setColor(c);
    g.drawString("" + userScore,USER_SCORE_X,SCORES_Y);
    g.drawString("" + computerScore,COMPUTER_SCORE_X,SCORES_Y);
  }
  public static void addToComputerScore(Graphics g) { //this updates the computers score
    drawScores(g,BACKGROUND_COLOR);
    computerScore++;
    drawScores(g,SCORE_COLOR);
  }
  public static void addToUserScore(Graphics g) {  //this updates the user score
    drawScores(g,BACKGROUND_COLOR);
    userScore++;
    drawScores(g,SCORE_COLOR);
  }
}
