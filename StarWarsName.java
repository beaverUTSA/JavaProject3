import java.text.*;
import java.util.*;
public class StarWarsName {                  //This program takes user input and rearanges it creatively
  public static final Scanner input = new Scanner(System.in);
  public static void main (String[] args) {
    String first = promptString("Enter Your First Name: ");
    String last = promptString("Enter Your Last Name: ");
    String mom = promptString("Enter Your Mother's Maiden Name: ");
    String city = promptString("Enter The City Where You Were Born: ");
    String car = promptString("Enter The First Car You Drove: ");
    System.out.println();
    System.out.print("You are " 
                       + first.substring(0,3) 
                       + last.substring(0,2) 
                       + " " 
                       + mom.substring(0,2) 
                       + city.substring(0,3) 
                       + " of " 
                       + last.substring(last.length() - 2, last.length())
                       + car);
  }
  public static String promptString(String prompt) { //This method converts input into a more compatible format
    System.out.print(prompt);
    String name = input.nextLine();
    String trim =name.trim();
    String up = trim.toUpperCase();
    return up;
  }
}
    
