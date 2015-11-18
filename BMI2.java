import java.util.*;

public class BMI2 {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main (String[] args) {
    double height;
    double weight;
    double bmi;
    
    System.out.println("Enter height:");
    height = CONSOLE.nextDouble();
    System.out.println("Enter weight:");
    weight = CONSOLE.nextDouble();
    
    bmi = weight / (height * height) * 703;
    
    System.out.println("Height is " + height);
    System.out.println("Weight is " + weight);
    System.out.println("BMI is " + bmi);
  }
}
