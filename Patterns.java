import java.util.*;
public class Patterns {
  public static final Scanner input = new Scanner(System.in);
  public static void main (String[] args) {
    textBoxes();
    textTiles();
  }
  
  public static void textBoxes() {
    System.out.println("Please enter number of desired boxes: ");
    int numBoxes = input.nextInt();
    System.out.print("+");
    for (int i = 1; i <= numBoxes; i++) {
      System.out.print("------+");
    }
    System.out.println();
    System.out.print("|");
    for (int i = 1; i <= numBoxes; i++) {
      System.out.print("      |");
    }
    System.out.println();
    System.out.print("|");
    for (int i = 1; i <= numBoxes; i++) {
      System.out.print("      |");
    }
    System.out.println();
    System.out.print("+");
    for (int i = 1; i <= numBoxes; i++) {
      System.out.print("------+");
    }
    System.out.println("\n");
  }
  
  public static void textTiles() {
    System.out.println("Please enter the width of the pattern: ");
    int width = input.nextInt();
    System.out.println("Please enter the height of the pattern: ");
    int height = input.nextInt();
    for (int i = 1; i <= width; i++){
      System.out.print(" __  ");
    }
    System.out.println();
    for (int i = 1; i <= height; i++){   
       for (int j = 1; j <= width; j++) {
         System.out.print("/  \\_");
       }
       System.out.println();
       for (int k = 1; k <= width; k++) {
         System.out.print("\\__/ ");
       }
       System.out.println();
    }
  }
}
