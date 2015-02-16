/**
 * Class Fan
 * @author Mike Deiters
 * @version	1.0
 * 
 * This class will create a fan
 * The purpose is to practice using classes
 */
public class Fan {
	
	final public static int SLOW=1;
	final public static int MEDIUM=2;
	final public static int FAST=3;
	private int speed;
	private boolean fanOn;
	private double radius;
	private String color;
	
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/**
	 * @return the fanOn
	 */
	public boolean isFanOn() {
		return fanOn;
	}
	
	/**
	 * @param fanOn the fanOn to set
	 */
	public void setFanOn(boolean fanOn) {
		this.fanOn = fanOn;
	}
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @param create a default fan
	 */
	public Fan(){
		speed=SLOW;
		fanOn=false;
		radius=5;
		color="blue";
	}
	
	/**
	 * @param returns the fan to the main
	 */
	public String toString(){
		String result;
		if(fanOn){
			result="speed: " + speed + "\n" + 
					"color: " + color + "\n" + 
					"radius: " + radius + "\n";
		}else{
			result="color: " + color + "\n" +
					"radius: " + radius + "\n" +
					"fan is off" + "\n";
		}
		return result;
	}
}
