public class Poems{
  public static void main(String[] args){
    System.out.println("Lab 1 written by Brian Biever \n");
    maryHad();
    oldMan();
  } //This program prints out a few verses from two poems using methods
    public static void maryHad() {
      System.out.println("Mary Had a Little Lamb \n");
      mary1();
      
      maryLamb();
      
      mary1();
      
      mary2();
      
    } //This method prints out the first verse in Mary Had a Little Lamb in order using other methods
    public static void oldMan() {
      System.out.println("This Old Man \n");
      
      oldMan1();
      
      oldMan2();

      oldMan3();

    } //This method prints out three verses of This Old Man in order using other methods
    
    public static void mary1(){
      System.out.println("Mary had a little lamb,");
    } //This prints the first and third verse for MHALL
    
    public static void maryLamb(){
      System.out.println("Little lamb, little lamb,");
    } //This prints the second verse for MHALL
    
    public static void mary2(){
      System.out.println("Its fleece was white as snow. \n");
    } //This prints the last verse for MHALL
    
    public static void oldMan1(){
      System.out.println("This old man, he played one");
      System.out.println("He played knick-knack on my thumb");
      System.out.println("With a knick-knack patty-whack, give a dog a bone");
      oldMainRefrain();
    } //This prints the first verse for This Old Man and uses a method for the refrain

    public static void oldMan2(){
      System.out.println("This old man, he played two");
      System.out.println("He played knick-knack on my shoe");
      System.out.println("With a knick-knack patty-whack, give a dog a bone");
      oldMainRefrain();
    } //This prints the second verse for This Old Man and uses a method for the refrain
    
    public static void oldMan3(){
      System.out.println("This old man, he played three");
      System.out.println("He played knick-knack on my knee");
      System.out.println("With a knick-knack patty-whack, give a dog a bone");
      oldMainRefrain();
    } //This prints the third verse for This Old Man and uses a method for the refrain
    
    public static void oldMainRefrain(){
      System.out.println("This old man came rolling home \n");
    } //This prints the refrain for each of The Old Man verses
    

    
}
