/**
 * @author Mike Deiters
 * @version 1.0
 * 
 * ITEC 2140-01
 * 
 * Find average of three numbers
 */
public class Average {
 
 
  public static void main(String[] args)
  {
    int first = 6;
    int second = 7;
    int third = 9;
    double average;
    
    // Average
    average = (first + second + third)/3;
    System.out.println("The average of " + first + ", " + second + ", " + third + " is: ");
    System.out.println(first + "+" + second + "+" + third + " = " + average);
    
  }
}
