import java.util.*;
public class Stars {
  public static final Scanner INPUT = new Scanner(System.in);
  public static void main (String[] args) {
    writeStars(13, '$');
    writeStars(7, '&');
    writeStars(35, '%');
    drawBox(10,3);
    drawBox(5,4);
  }
  public static void writeStars(int num, char ch){
    for (int i = 1; i <= num; i++) {
      System.out.print(ch);
    }
    System.out.println("\n");
  }
  public static void drawBox (int width, int height) {
    for (int i = 1; i <= width; i++){
      System.out.print("*");
    }
    System.out.println();
    for (int j = 1; j <= (height-2); j++) {
      System.out.print("*");
      for (int k = 1; k <= (width-2); k++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
    for (int l = 1; l <= width; l++) {
      System.out.print("*");
    }
    System.out.println("\n"); 
  }
}

