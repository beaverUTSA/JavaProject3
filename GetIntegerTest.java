import java.util.*;
public class GetIntegerTest {
  public static final String MAIN_PROMPT = "Please enter an integer between 1 and 100";
  public static void main (String[] args) { 
    System.out.println("GetIntegerTest by Brian Biever");
    Scanner console = new Scanner(System.in);
    int value = getIntegerBetweenOneAndOneHundred(console);
    System.out.println("The number entered is "+value);
  }
  public static int getIntegerBetweenOneAndOneHundred(Scanner console){
    System.out.println(MAIN_PROMPT);
    boolean goodValueFound = false;
    int value = -1;
    while(!goodValueFound) {
      if(console.hasNextInt()) {
        value = console.nextInt();
        if (value >= 1 && value <= 100) {
          goodValueFound = true;
        }else{
          System.out.println("The value "+value+" entered was not in range, try again");
          System.out.println(MAIN_PROMPT);
        }
      }
        else{
          System.out.println(MAIN_PROMPT);
          console.next();
        }
      }
    
    return value;
  }
}

