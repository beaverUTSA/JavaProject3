import java.util.*;
public class Playoffs {
  public static void main(String[] args) {   //This program generates random numbers to simulate playoffs between two teams along with the percentage the user gives to randomly decide a winner
    System.out.println("Lab 6 written by Brian Biever\n");
    System.out.println("What is the percent chance of Team 1 winning a game?");
    Scanner input = new Scanner(System.in);
    double percent = input.nextDouble();
    Random r = new Random();
    while (percent < 0 || percent > 100) {
      System.out.println("Please enter a percentage between 0 and 100.");
      percent = input.nextDouble();
    }
    System.out.println(winTen(percent, r));
  }
  public static boolean oneGame(double percent, Random r) { //This method randomly decides a winner based on user input compared to a random number
    int chance = r.nextInt(100);
    if (chance < percent)
      return true;
    else
      return false;
  }
  public static boolean winFour(double percent, Random r) {   //This method uses the previous method until one team has four wins
    int team1 = 0;
    int team2 = 0;
    while (team1 < 4 && team2 <4){
      if (oneGame(percent, r)){
        team1++;
      }else{
        team2++;
      }
    }
    if (team1 == 4){
      return true;
    }else{
      return false;
    }
  }
  public static String winTen(double percent, Random r) {   //This method uses the previous method until one team has 10 more playoff wins than the other team, prints out who won which playoff, then declares a victor
    int win1 = 0;
    int win2 = 0;
    while (win1 <  win2 + 10 && win2 < win1 + 10 ) {
      if (winFour(percent, r)) {
        win1++;
        System.out.print(1);
      }else{
        win2++;
        System.out.print(2);
      }
    }
    System.out.println();
    if (win1 > win2) {
      return "Team 1 wins!";
    }else{
      return "Team 2 wins!";
    }
  }
}
