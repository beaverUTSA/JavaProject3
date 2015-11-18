public class Pyramid {
  public static void main (String[] args) {
    for (int r = 0; r < 6; r++) {
      for (int s = 5; s > 0; s--) {
        System.out.print(" ");
      }
      for (int a = 1; a < 11; a = a + 2) {
        System.out.print("*");
      }
    }
  }
}
