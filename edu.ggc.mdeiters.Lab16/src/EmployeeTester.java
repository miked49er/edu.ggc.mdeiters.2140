
public class EmployeeTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        Employee mike = new Employee();
        mike.setName("Mike");
        mike.setHourlyRate(17.50);
        mike.setHoursWorked(40);
        
    //    mike.name = " try"; not allowed because name  in Employee is private
        
        Employee e = new Employee();
        e.setName("Sully");
        e.setHourlyRate(18);
        e.setHoursWorked(45);
        
        System.out.println("This week " + mike.getName()+ " made $" + mike.computePaycheck());
        System.out.println("This week " + e.getName()+ " made $" + e.computePaycheck());
        

	}

}
