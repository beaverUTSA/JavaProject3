import java.util.*;

public class PrintSquares2a {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main (String[] args) {
    int count;
    int num1;
    int num2;
    
    System.out.println("Please enter your starting range for powers: ");
    num1 = CONSOLE.nextInt();
    
    System.out.println("Please enter your ending range for powers: ");
    num2 = CONSOLE.nextInt();
    
    for (count = num1; count <= num2; count++) {
      System.out.println(count + " squared is " + (count * count));
    }
  }
}
