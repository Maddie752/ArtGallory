import java.util.Scanner;

public class ScannerTut {
  public static void main(String[] args) {
    System.out.println("wellcome to the art gallery!");
    System.out.println("how many pices of art would you like to buy");
      
       Scanner scan = new Scanner(System.in);
      int picesOfArt = scan.nextInt();
      int count = 1;
    while (count < picesOfArt) {
      System.out.print("witch pices do you want to buy");
      int witchPices = scan.nextInt();

     if (witchPices == 2){
 
    }
    else 
    {
    
    System.out.println("that's a good choice");
    System.out.println("would you like your pices to be gift wraped up for you ");
    System.out.println("or put in a bag ");//
    System.out.println(" have a good day and come again");
    //
    
    System.out.println("wellcome to the art gallery!");//
    System.out.println("how many pices of art would you like to buy");//
      
       Scanner scan = new Scanner(System.in);
      int picesOfArt = scan.nextInt();
      int count = 3;
      while (count < picesOfArt) {
      System.out.print("witch pices do you want to buy");
      int witchPices = scan.nextInt();//

     if (witchPices == 4){
    }
     if (witchPices == 5){

    }
    else  
    {

    System.out.println("those are very beautiful choices");//
    System.out.println("how would you like your pices to be delivered for you");//
    System.out.println("we can do it by airplane, overseas,or by mail"); // 
     System.out.println("by mail you said");
     byMailYouSaid = scan.nextInt();//
     System.out.println("will that be all");
     willThatBeAll = scan.nextInt();//
     System.out.println("come back soon and have a good day");
     }
}