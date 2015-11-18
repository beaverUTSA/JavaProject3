import java.util.*;
public class Odd {
  public static void main (String[] args) {
    Scanner console = new Scanner(System.in);
    while(true){
      System.out.println("Please enter a number");
      int input = console.nextInt();
      if (input%2 != 0)
        System.out.println("This number is odd");
      else
        System.out.println("This number is even");
    }
  }
}
