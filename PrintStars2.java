public class PrintStars2 {
  public static void main(String[] args) {
    for (int row = 1; row <= 6; row++) {
      for (int column = 6; column >= row; column--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
