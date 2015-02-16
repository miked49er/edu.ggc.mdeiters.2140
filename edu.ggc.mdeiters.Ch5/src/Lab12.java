/** Class: Lab12
 * @author mdeiters
 * @version 1.0
 * 
 * This class calculates the value of pi.
 * The purpose of this class is to practice using methods.
 * 
 */
public class Lab12 {

	public static void main(String[] args) {
		
		int iter = 0;
  
		for (int j=1;j<=10;j++){
			iter = j * 10000;
			System.out.println(iter + "\t" + pi(iter));
		}

	}
	
	public static double pi(int iter){
		double sum = 0;
		for (int k=1;k<=iter;k++){
			sum += ((Math.pow(-1.0, k))/(2*k-1));
		}
		double pi = 4.0 * (-sum);
		sum = 0;
		return pi;
	}
}

