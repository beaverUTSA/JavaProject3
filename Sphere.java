import java.util.*;

public class Sphere {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main (String[] args) {
    double diameter;
    double circum;
    double volume;
    double radius;
    
    volume = 0.0;
    
    System.out.println("Please enter the diameter of your sphere: ");
    
    diameter = CONSOLE.nextDouble();
    
    circum = Math.PI * diameter;
    
    System.out.println("Your sphere's circumference is: " + circum);
    
    radius = diameter / 2;
    
    volume = (4  * Math.PI * (radius * radius * radius)) / 3; 
    
    System.out.println("Your sphere's volume is: " + volume);
  }
}
