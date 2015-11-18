public class BoxAsterisks {
  public static void main (String[] args) {
  topBottom();
  System.out.println();
  middle();
  topBottom();
  System.out.println();
  }
  public static void topBottom() {
    for (int top = 0; top < 15; top++) {
      System.out.print("*");
    }
  }
  public static void middle() {
    for (int middle = 0; middle < 3; middle++) {
      System.out.print("*");
      for (int spaces = 0; spaces < 13; spaces++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}
 
