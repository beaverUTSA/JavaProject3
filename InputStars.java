import java.util.*;

public class InputStars {
  
   public static final Scanner CONSOLE = new Scanner(System.in);
  
   public static void main (String[] args) {
      
      System.out.println("Please enter an integer: ");

      int stars = CONSOLE.nextInt();

      for (int i=0; i < stars; i++)  {  
        System.out.print("*");
      }

   } 
}
   
