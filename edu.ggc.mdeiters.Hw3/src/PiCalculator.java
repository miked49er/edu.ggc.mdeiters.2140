/**
 * Class: PiCalculator
 * @version 1.0
 * @author miked49er
 *
 *This class is used to calculate the value of Pi
 *Purpose is to practice for loops
 */
public class PiCalculator {

 public static void main(String[] args) {
  
  double Pi = 0;
  double sum = 0;
  int i = 0;
  
  for (int j=1;j<=10;j++){
   i = j * 10000;
   
   for (int k=1;k<=i;k++){
    sum += ((Math.pow(-1.0, k))/(2*k-1));
   }
  Pi = 4.0 * (-sum);
  sum = 0;
  System.out.println(i + "\t" + Pi);  
  }
 }
}
