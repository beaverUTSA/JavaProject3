public class charPyramid {
  public static void main (String[] args) {
    pyramidHeight(5);
  }
  public static void pyramidHeight(int rows){
    for (int i = 1; i <= rows; i++) {
      printChars(' ', 6-i);
      printChars('*', 2*i-1);
      System.out.println();
    }
  }
  
  public static void printChars(char charr, int num) {
    for (int i = 1; i <= num; i++){
      System.out.print(charr);
    }

  }
}
