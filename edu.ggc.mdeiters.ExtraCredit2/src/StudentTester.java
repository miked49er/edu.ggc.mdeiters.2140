/**
 * Class StudentTester
 * @author Mike Deiters
 * @version 1.0
 * 
 * This class tests the class Student
 * The purpose of this class is to use the class student to create students
 */
public class StudentTester {

	public static void main(String[] args) {
		
		// creates student1
		Student student1=new Student();
		student1.setFirstName("Mickey");
		student1.setLastName("Mouse");
		student1.setStudentNumber(90009999);
		student1.adjustGPA(2.0);
		student1.addCreditsToTotal(25);
		
		//creates student2
		Student student2=new Student();
		student2.setFirstName("Donald");
		student2.setLastName("Duck");
		student2.setStudentNumber(90001111);
		student2.adjustGPA(2.5);
		student2.addCreditsToTotal(30);
		
		// prints the original output
		System.out.println("Original");
		System.out.println("Student1" + "\n" + student1.toString());
		System.out.println("Student2" + "\n" + student2.toString());
		
		// adjustment of student1
		student1.addCreditsToTotal(5);
		student1.adjustGPA(2.2);
		
		System.out.println("\n" + "After Adjustment");
		System.out.println("Student1" + "\n" + student1.toString());
	}

}
