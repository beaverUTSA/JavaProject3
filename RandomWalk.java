import java.util.*;
import java.text.*;
import java.awt.*;
public class RandomWalk{ //This program asks the user for a radius and a color then randomly draws a dot until it hits the radius of the circle
  public static final int MIDDLE = 450;
  public static int radius;
  public static int x;
  public static int y;
  public static void main(String[] args) { //This method decides if the user submitted proper data, then draws the panel, the cirlce and the walking
    System.out.println("Lab 7 by Brian Biever\n");
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the radius of a circle");
    radius = input.nextInt();
    while(radius < 50 || radius > 400){
      System.out.println("Please enter a radius between 50 and 400");
      radius = input.nextInt();
    }
    x = ((radius * 2 + 100)/2);
    y = ((radius * 2 + 100)/2);
    System.out.println("You have selected " + radius);
    System.out.println("Do you want the cirlce to be red or blue?");
    String color = input.next();
    while(!matchesChoice(color, "blue") && !matchesChoice(color, "red")) {
      System.out.println("You have selected " +color);
      System.out.println("Please enter either blue or red.");
      color = input.next();
    }
    System.out.println("You have selected " +color);
    Color circle;
    Color walk;
    if (matchesChoice(color, "red")) {
      circle = Color.red;
      walk = Color.blue;
    } else if(matchesChoice(color, "blue")){
      circle = Color.blue;
      walk = Color.red;
    } else {
      circle = Color.black;
      walk = Color.black;
    }
    DrawingPanel panel = new DrawingPanel(radius * 2 + 100, radius * 2 + 100);
    Graphics g = panel.getGraphics();
    Random r = new Random();
    g.setColor(circle);
    g.drawOval(((radius * 2 + 100)/2)-radius,((radius * 2 + 100)/2)-radius, radius *2, radius*2);
    g.setColor(walk);
    int steps = 0;
    while(!outOfBounds()){
      randomWalk(g, r);
      steps++;
    }
    System.out.println("It randomly walked " + steps + " steps.");
  } //The method below compares two strings and 
  public static boolean matchesChoice(String answer, String choice){
    if (answer.toLowerCase().equals(choice) || answer.toLowerCase().startsWith(choice.substring(0,1))){
      return true;
    }else{
      return false;
    }
  }
  //The method below randomly draws a dot and randomly changes its location
  public static void randomWalk(Graphics g, Random r){
    g.drawLine(x, y, x, y);
    int step = r.nextInt(4);
    if (step == 0)
      y--;
    if (step == 1)
      y++;
    if (step == 2)
      x++;
    if (step == 3)
      x--;
  }
  //The method below makes a circle with a certain radius based on x and y and compares it to the entered radius
  public static boolean outOfBounds() {
    while (Math.sqrt(Math.pow((x-((radius * 2 + 100)/2)), 2) + Math.pow((y-((radius * 2 + 100)/2)), 2)) <= radius){
      return false;
    }
    return true;
  }
}
