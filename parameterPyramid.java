public class parameterPyramid {
  public static void main (String[] args) {
    for (int x = 1; x <= 6; x++){
      printBlanks(6-x);
      printStars(2*x+1);
      System.out.println();
    }
  }
  public static void printBlanks(int blanks){
    for (int i = 1; i <= blanks; i++) {
      System.out.print(" ");
    }
  }
  public static void printStars(int stars){
    for (int i = 3; i <= stars ; i++) {
      System.out.print("*");
    }
  }
}
