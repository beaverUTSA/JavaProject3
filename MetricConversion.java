import java.util.*;
public class MetricConversion{
  public static final Scanner CONSOLE = new Scanner(System.in); 
  public static void main(String[] args){
    System.out.println("Project 1 written by Brian Biever\n");   //This program converts a range of numbers from kilograms to pounds
    kiloToPounds();                                              //It then creates a table with feet and inches to meters conversions
    feetInchesToMeters();
  }
  public static void kiloToPounds(){                             //This method converts a user-entered range and uses a for-loop for conversion and display
      int kilo1;
      int kilo2;
      System.out.println("This will convert a range of kilograms to pounds\n");
      System.out.println("Please enter the first range for kilograms: ");
      kilo1 = CONSOLE.nextInt();
      System.out.println("Please enter the second range for kilograms: ");
      kilo2 = CONSOLE.nextInt();
      System.out.println("Kilograms\tPounds");
      for(kilo1 = kilo1; kilo1 <= kilo2; kilo1++){
        System.out.print(kilo1 + "\t");
        System.out.printf("%.4f", kilo1 / 0.45359237);
        System.out.println();
      }
  }
    
  public static void feetInchesToMeters(){                       //This method prints a table that converts inches to meters using loops for the table
    int i;                                                   
    int f;
    System.out.println("\nPlease enjoy this Feet and Inches to Meters conversion table:");
    System.out.println();
    System.out.println("\tInches");
    System.out.print("Feet");
    for ( i = 0; i <= 11; i++){
      System.out.print("\t" + i);
    }
      System.out.println();
    i=0;
    for ( f = 0; f <=9; f++){
      System.out.print(f + "\t");
      for (int t =0; t <= 11; t++){
        System.out.printf("%.4f", i * 0.0254);
        System.out.print("\t");
        i++;
      }
      System.out.println();
    }
  }
}
    
