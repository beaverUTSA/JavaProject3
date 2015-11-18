import java.text.*;
import java.util.*;
public class Reverse {
  public static final Scanner input = new Scanner(System.in);
  public static void main (String[] args) {
    String s = input.next();
    for (int i = s.length(); i >= 0; i--){
      System.out.println(s.charAt(i));
    }
  }
}
