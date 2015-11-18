public class BMI1 {
  public static void main (String[] args) {
    double height;
    double weight;
    double bmi;
    
    height = 70.0;
    weight = 195.0;
    bmi = weight / (height * height) * 703.0;
    
    System.out.println("Height is " + height + " inches");
    System.out.println("Weight is " + weight + " pounds");
    System.out.println("Body mass index is " + bmi);
  }
}
