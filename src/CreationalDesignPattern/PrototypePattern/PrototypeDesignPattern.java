package CreationalDesignPattern.PrototypePattern;

import java.util.List;

public class PrototypeDesignPattern {
public static void main(String[] args) {
	/**
	 * When creating an object is very expensive that time we use Prototype pattern to clone that object .
	 * 
	 *  We will create an Employee for which loading the employee details is very time consuming and resource taking.
	 *  so we will use prototype pattern here to clone the object instead of again creating the object . 
	 */
	
	// created an employee class (original)
	Employee emp = new Employee();
	// loading data from DB
	emp.loadData();
	
	// we need  a same object on which we will do some modification
	Employee clonedEmp = emp.cloning();
	List<String> employees = clonedEmp.getEmployees();
	employees.add("Dibya");

	System.out.println("Original Employee list : "+emp.getEmployees());
	System.out.println("Cloned Employee list : "+employees);
	
}
}
