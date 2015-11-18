import java.util.*;

public class Coins {
  
  //This allows the program to accept inputs
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main (String[] args) {
    
    //This prints the lab title and coder
    System.out.println("Lab 2 by Brian Biever");
    
    System.out.println();
    
    //This calls the method that prints the total amount of coins and the value of them
    inputCoins();
    
    //This calls the method that prints the amount of each coin you could have based on an inputted value
    makeChange();
  }
  
  //This method declares the variables for the different coins, then adds them together based on their values
  //Then prints the amount of coins and the total value
  public static void inputCoins(){
    int cent = 0;
    int nick = 0;
    int dime = 0;
    int quar = 0;
    
    System.out.println("Please enter number of pennies: ");
    cent = CONSOLE.nextInt();
    System.out.println();
    System.out.println("Please enter number of nickels: ");
    nick = CONSOLE.nextInt();
    System.out.println();
    System.out.println("Please enter number of dimes: ");
    dime = CONSOLE.nextInt();
    System.out.println();
    System.out.println("Please enter number of quarters: ");
    quar = CONSOLE.nextInt();
    System.out.println();
    double total = (cent * 0.01) + (nick * 0.05) +(dime * 0.1) + (quar * 0.25);
    
    System.out.println("You have " + (quar + dime + nick + cent) + " coins.");
    System.out.println();
    System.out.println("Your total is $" + total);
    System.out.println();
}
  //This method reuses the variables from the first method but returns them to zero, then takes an integer and
  //calculates the amount of coins you could have based on their inital values then their remainders
  public static void makeChange(){
    int cent = 0;
    int nick = 0;
    int dime = 0;
    int quar = 0;
    
    System.out.println("Please enter number of cents: ");
    int totalCents = CONSOLE.nextInt();
    System.out.println();
    
    quar = totalCents / 25;
    int bank = totalCents % 25;
    dime = bank / 10;
    bank = bank % 10;
    nick = bank / 5;
    cent = bank %5;
    
    System.out.println("You could have " + quar + " quarters, " + dime + " dimes, " + nick + " nickels, and " + cent + " pennies.");
  }
}
