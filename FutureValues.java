import java.util.*;
import java.text.*;
public class FutureValues {
  public static final Scanner INPUT = new Scanner (System.in);        //This program first takes a value, an
  public static void main (String[] args) {                           //intrest rate, and a number of years
    double p;                                                         //to find the compound interest value.
    double r;                                                         //It then takes in similar values to 
    double y;                                                         //calculate a future annuity.
    System.out.println("Lab 3 written by Brian Biever");
    System.out.println("Please enter present account value: ");
    p = INPUT.nextDouble();
    System.out.println("Please enter intrest rate: ");
    r = INPUT.nextDouble();
    System.out.println("Please enter number of years: ");
    y = INPUT.nextDouble();
    double fv = futureValue(p,r,y);
    String value = moneyString(fv);
    System.out.println("Your future compound interest value would be " + value);
    System.out.println("Please enter yearly payment: ");
    p = INPUT.nextDouble();
    System.out.println("Please enter intrest rate: ");
    r = INPUT.nextDouble();
    System.out.println("Please enter number of years: ");
    y = INPUT.nextDouble();
    double fa = futureAnnuity(p,r,y);
    String annuity = moneyString(fa);
    System.out.println("Your future Annuity value would be " + annuity);
  }
  public static double futureValue(double p, double r, double y) {     //This method calculates compound
    double future =  p * Math.pow( 1 + r/100 , y);                     //intrest and returns its value
    return future;
  }
  public static double futureAnnuity(double p, double r, double y) {   //This method calculates future
    double annuity = p * (((Math.pow(1 + r /100, y))-1)/(r/100));      //and returns that value
    return annuity;
  }
  public static String moneyString (double amount){                    //This method takes a double amount
    DecimalFormat dollarsAndCents = new DecimalFormat("$#0.00");       //and returns the amount that is a
    return dollarsAndCents.format(amount);                             //string, but in decimal format
  }
}
