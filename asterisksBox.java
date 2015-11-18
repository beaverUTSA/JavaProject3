public class asterisksBox{
  public static void main(String[] args){
    printAsterisks();
    for (int i = 1; i <= 5; i++){
    printAsteriskSpacesAsterisk();
    }
    printAsterisks();
  }
    public static void printAsterisks(){
      for (int i =1; i <= 12; i++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    public static void printAsteriskSpacesAsterisk(){
      System.out.print("*");
      for (int i=1; i <= 10; i++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
