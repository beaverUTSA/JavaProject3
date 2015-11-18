import java.awt.*;
import java.text.*;
import java.util.*;
public class Workspace{
  public static void main(String[] args){
    System.out.println(6*3/4 + 6/4*3 + 3/4*6);
    int age;
    age = 27;
    double profitRC = 0.0;
    System.out.println(age);
    System.out.println();
    under65(5);
    System.out.println();
    String b = "Computers are fun";
    System.out.println(b.indexOf("puts"));
    System.out.println(names("Biever","Brian"));
    //graphics();
    String s = "abcabcabc";
    s.indexOf("bc");
    System.out.println(Character.getNumericValue('B'));
  }
  public static void graphics() {
    DrawingPanel panel = new DrawingPanel(300, 200);
    Graphics g = panel.getGraphics();
    
  }

public static int under65 (int years) {
   int age = Math.min(years,65);
   return age;
   //System.out.println(age);
}
public static String names (String last, String first) {
   return last;

}

}
