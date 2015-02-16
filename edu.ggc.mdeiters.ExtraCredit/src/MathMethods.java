/**Class: MathMethod
 * 
 * @author Mike Deiters
 * @version 1.0
 * 
 * This class uses methods to recreate some of the Math methods.
 * The purpose of theis class is to practice using methods.
 */
import java.util.Scanner;
public class MathMethods {

	public static void main(String[] args) {
		//inputs
		double num1=0;
		double num2=0;
		int cont;
		Scanner input=new Scanner(System.in);
		
		//prompt for user input
		do {
			System.out.print("Please enter a number:");
			num1=input.nextDouble();
			System.out.print("Please enter another number (no decimal portion please):");
			num2=input.nextDouble();
			
			//output
			System.out.println("\n" + "The absolute value of "+ num1 + " is " + abs(num1) + ".");
			System.out.println(num1 + " to the power of " + num2 + " is " + pow(num1,num2) + ".");
			System.out.println("The greater value between " + num1 + " and " + num2 + " is " + max(num1,num2));
			System.out.println("The lesser value between " + num1 + " and " + num2 + " is " + min(num1,num2) + "\n");
			
			//continue?
			System.out.print("Do you want to continue? (1 for yes, 0 for no):");
			cont=input.nextInt();
			System.out.print("\n");
		} while (cont==1);
		

	}
	
	//absolute Value
	public static double abs(double num1){
		if(num1<0){
			return -num1;
		}else{
		return num1;
		}
	}
	
	//power
	public static double pow(double num1, double num2){
		double sum=1;
		double sumD=10;
		double sumSqrt=1;
		int powD= (int)num2*10;
		double sqrtE=powD/2.5;
		int interger = (int)num2;
		int decimal = (int)(10*num2-10*interger);
		
		if(decimal>0){
			for(int i=0;i<powD;i++){
				sumD*=(int)num1;
			}
			for(int i=0;i<sqrtE;i++){
				sumSqrt*=10;
			}
			sum=(1/sumSqrt)*Math.sqrt(sumD);
		}else if(num2>0){
			for(int i=0;i<interger;i++){
				sum *= num1;
			}
			/*
			if(decimal>0){
				for(int i=0;i<decimal;i++){
					sum *= 
				}
			}
			*/
		}else{
			for(int i=0;i>num2;i--){
				sum *= 1/num1;
			}
		}
		
		return sum;
	}
	
	//max
	public static double max(double num1, double num2){
		double result;
		if(num1>num2){
			result = num1;
		}else{
			result = num2;
		}
		return result;
	}
	
	//min
	public static double min(double num1, double num2){
		double result;
		if(num1<num2){
			result = num1;
		}else{
			result = num2;
		}
		return result;
	}

}
