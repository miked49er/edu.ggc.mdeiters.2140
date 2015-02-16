/**
 * @author Mike Deiters
 * @version 1.0
 * 
 * ITEC 2140-01
 * 
 */
import java.util.Scanner;

public class InputNumbers{
 
 
  public static void main(String[] args)
  {
	  Scanner input = new Scanner(System.in);
      int a ;
      double b ;
      
      // User input
      System.out.print("Input the first interger. (No decimals please) ");
      a = input.nextInt();
      System.out.print("Input the second number. ");
      b = input.nextDouble();
     
      
      System.out.println("A = " + a + " B = " + b);
  }
}
