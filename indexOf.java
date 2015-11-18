import java.text.*;
import java.util.*;
public class indexOf {
  public static final Scanner input = new Scanner(System.in);
  public static void main (String[] args){
  String s = input.next();
  for (int i = 0 ; i < s.length(); i++){
    System.out.println(s.indexOf(s.charAt(i)));
  }
  }
}
  
