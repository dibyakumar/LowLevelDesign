package CreationalDesignPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Prototype {
	private List<String> employeelist;
	
	public Employee() {
		this.employeelist = new ArrayList<String>();
	}
	
	public Employee(List<String> list) {
		this.employeelist = list;
	}
	
	public List<String> getEmployees(){
		return employeelist;
	}
	
	public void loadData() {
		//read all employees from database and put into the list
		employeelist.add("Pankaj");
		employeelist.add("Raj");
		employeelist.add("David");
		employeelist.add("Lisa");
	}

	// cloning
	@Override
	public Employee cloning() {
		List<String> list = new ArrayList<String>();
		for(String str : this.employeelist) {
			list.add(str);
		}
		return new Employee(list);
	}
	
	
}
