import java.text.*;
import java.util.*;
public class methodMaster {
  public static void main(String[] args) {
  double area = areaTriangle(2,2);
  System.out.println(area);
  }
  public static double areaTriangle(double base, double height) {
    double area = base * height / 2.0;
    return area;
  }
}
