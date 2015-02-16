/**
 * Class Student
 * @author miked49er
 * @version 1.0
 * 
 * This class creates a student
 * The purpose is to create students
 */
public class Student {
	
	private String firstName;
	private String lastName;
	private int totalCreditsPassed;
	private double gpa;
	private int studentNumber;
	
	
	/**
	 * getFirstName
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * setFirstName
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * getLastName
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * setLastName
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * addCreditsToTotal
	 * @param add totalCreditsPassed to totalCreditsPassed
	 */
	public void addCreditsToTotal(int totalCreditsPassed) {
		this.totalCreditsPassed += totalCreditsPassed;
	}
	
	/**
	 * adjustGPA
	 * @param adjust the gpa
	 */
	public void adjustGPA(double gpa) {
		this.gpa = gpa;
	}
	
	/**
	 * getStudentNumber
	 * @return the studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}
	
	/**
	 * setStudentNumber
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	/**
	 * toString
	 * @return the results
	 */
	public String toString(){
		String result;
		result="First name: " + "\t\t" + firstName + "\n" +
				"Last name: " + "\t\t" + lastName + "\n" +
				"Student Number: " + "\t" + studentNumber + "\n" +
				"Total Credits Passed: " + "\t" + totalCreditsPassed + "\n" +
				"GPA: " + "\t\t\t" + gpa + "\n";
		return result;
	}
}
