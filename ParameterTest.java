public class ParameterTest {
  public static void main (String[] args) {
    int x = 3;
    System.out.println("x is " + x);
    increment(x);
    System.out.println("x is now " + x);
  }
  
  public static void increment (int x) {
    System.out.println("In increment x is " + x);
    x = x + 1;
    System.out.println("In increment x is now "+ x);
  }
}
