/**
 * Class FanTester
 * @author Mike Deiters
 * @version 1.0
 * 
 * This is the tester class for the class Fan
 * The purpose of this class is to test the class Fan
 */
public class FanTester {

	public static void main(String[] args) {
		
		Fan fan1=new Fan();
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setFanOn(true);
		
		Fan fan2=new Fan();
		fan2.setSpeed(fan2.MEDIUM);
		fan2.setRadius(6);
		fan2.setColor("blue");
		fan2.setFanOn(false);
		
		System.out.println("Fan1" + "\n" + fan1.toString());
		System.out.println("Fan2" + "\n" + fan2.toString());

	}

}
