public class Wavy {
  public static void main (String[] args) {
  forward();
  backward();
  forward();
  backward();
  forward();
  backward();
  }
  public static void forward() {
    for (int i = 0; i < 8; i++){
      System.out.print("/");
    }
    System.out.println();
  }
  public static void backward() {
    for (int i = 0; i < 8; i++){
      System.out.print("\\");
    }
    System.out.println();
  }
}
