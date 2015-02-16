/*
 * Create a class named Computer which has instance variables for size (int) and speed (double).
 * Add accessor (getter) methods for the two variables.
 * 
 */
public class Computer {
	private int size;
	private double speed;
	
	
	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
