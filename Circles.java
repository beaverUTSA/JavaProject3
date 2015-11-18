import java.awt.*;
import java.util.*;
public class Circles {
  public static void main (String[] args) { //This method asks for inputs and fills circles, then calls methods
    Scanner input = new Scanner (System.in);
    DrawingPanel panel = new DrawingPanel (400, 300);
    Graphics g = panel.getGraphics();
    System.out.println("Lab 5 written by Brian Biever");
    System.out.println("Please enter the X center value of the Cyan circle: ");
    int x1 = input.nextInt();
    System.out.println("Please enter the Y center value of the Cyan circle: ");
    int y1 = input.nextInt();
    System.out.println("Please enter the radius of the Cyan circle: ");
    int r1 = input.nextInt();
    g.setColor(Color.cyan);
    g.fillOval(x1-r1, y1-r1, r1*2, r1*2);
    System.out.println("Please enter the X center value of the Magenta circle: ");
    int x2 = input.nextInt();
    System.out.println("Please enter the Y center value of the Magenta circle: ");
    int y2 = input.nextInt();
    System.out.println("Please enter the radius of the Magenta circle: ");
    int r2 = input.nextInt();
    g.setColor(Color.magenta);
    g.fillOval(x2-r2, y2-r2, r2*2, r2*2);
    System.out.println("Please enter the X center value of the Yellow circle: ");
    int x3 = input.nextInt();
    System.out.println("Please enter the Y center value of the Yellow circle: ");
    int y3 = input.nextInt();
    System.out.println("Please enter the radius of the Yellow circle: ");
    int r3 = input.nextInt();
    g.setColor(Color.yellow);
    g.fillOval(x3-r3, y3-r3, r3*2, r3*2);
    System.out.println("The Cyan circle" + size (r1, r2) + " the Magenta circle");
    System.out.println("The Cyan circle" + size (r1, r3) + " the Yellow circle");
    System.out.println("The Magenta circle" + size (r2, r3) + " the Yellow circle");
    System.out.println("The Cyan circle" + intersect(x1, y1, r1, x2, y2, r2) + " the Magenta circle");
    System.out.println("The Cyan circle" + intersect(x1, y1, r1, x3, y3, r3) + " the Yellow circle");
    System.out.println("The Magenta circle" + intersect(x2, y2, r2, x3, y3, r3) + " the Yellow circle");
  }
  public static String size (int ra, int rb) { //This method compares the circles sizes
    if (ra > rb) {
      return " is bigger than ";
    } else if (ra < rb){
      return " is smaller than ";
    } else {
      return " is equal to ";
    }
  }
  public static String intersect (int xa, int ya, int ra, int xb, int yb, int rb) {  //This method checks if two cirlces intersect
    if (Math.sqrt((Math.pow((xa-xb), 2) + Math.pow((ya-yb), 2))) <= (ra + rb)){
      return " intersects ";
    } else {
      return " does not intersect ";
    }
  }
  
}
