import java.util.*;
public class Binary {
  public static void main(String[] args) {
    System.out.println("Lab 8 written by Brian Biever");
    boolean loop = true;
    while(loop){
      Scanner input = new Scanner(System.in);
      int decimal = getInt(input, "Please enter a positive integer: ");
      while (decimal < 0) 
        decimal = getInt(input, "Please enter a positive integer: ");
      System.out.print(decimal + " in binary is ");
      printBinaryArray(convertToBinary(decimal));
      System.out.println("\nDo you wish to continue? (yes or no)");
      String end = input.next();
      while (!end.equals("yes") && !end.equals("no")){
        System.out.println("Please enter yes or no: ");
        end = input.next();
      }
      if (end.equals("yes")){
        System.out.println("Restarting...");
      }
      if (end.equals("no")){
        System.out.println("Goodbye!");
        loop = false;
      }
    }
  }
  public static int[] convertToBinary(int decimal) {
    int decimalCopy = decimal;
    int len = 0;
    while (decimal > 0){
      decimal = decimal/2;
      len++;
    }
    while (decimalCopy == 0) {
      decimalCopy--;
      len++;
    }
    decimal = decimalCopy;
    int [] binary = new int[len];
    int index = 0;
    while (decimal > 0) {
      if (decimal % 2 != 0){
        binary[index] = 1;
      }else{
        binary[index] = 0;
      }
      decimal = decimal / 2;
      index++;
    }
    return binary;
  }
  public static void printBinaryArray(int[] binary) {
    for (int i = binary.length -1; i >= 0; i--) 
      System.out.print(binary[i]);
    
  }
  public static int getInt(Scanner console, String prompt) {
    System.out.println(prompt);
    while (!console.hasNextInt()) {
      console.next();
      System.out.println("That is not an integer; please try again: ");
      System.out.print(prompt);
    }
    return console.nextInt();
  }
}
