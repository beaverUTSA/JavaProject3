public class PrintBox {
  public static final int BOX_HEIGHT = 7;
  public static final int BOX_WIDTH = 12;
  
  public static void main(String[] args) {  
  printAsterisks( );
  for (int i = 1; i <= BOX_HEIGHT - 2; i++) {
    printAsteriskSpacesAsterisk( );
  }
  printAsterisks( );
}
  public static void printAsterisks( ) {  
  for (int i = 1; i <= BOX_WIDTH; i++) {  
    System.out.print("*");
  }
  System.out.println( );
  }
  public static void printAsteriskSpacesAsterisk( ) {  
  System.out.print("*");
  for (int i = 1; i <= BOX_WIDTH -2; i++) {
    System.out.print(" ");
  }
  System.out.print("*");
  System.out.println( );
  }
  
}
