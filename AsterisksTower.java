public class AsteriskTower {
  public static void main (String[] args) {
    for (int row = 1; row <= 6; row++) {
      //print leading blanks
      printOneStar();
      //print internal blanks
      printOneStar();
      printOneNewline();
    }
  }
  public static void leadingBlanks() {
    int leadingBlanks = 5;
  }
    public static void printOneStar() {
      System.out.print("*");
    }
    public static void printOneNewline() {
      System.out.println();
    }
}
 
