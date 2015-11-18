import java.util.*;
public class DiceRoller{
  public static void main (String[] args) {
    int a = 0;
    while (a == 0){
      Scanner input = new Scanner(System.in);
      Random r = new Random();
      System.out.println("Roll a ___ sided die.");
      int x = input.nextInt();
      System.out.println("How many times?");
      int y = input.nextInt();
      for (int i = 1; i <= y; i++)
        System.out.print(1 + r.nextInt(x) + " ");
      System.out.println();
    }
  }
}
