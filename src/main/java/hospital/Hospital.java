package hospital;

import java.util.*;

public class Hospital {


	//Make a Map to house employees
	private Map<String, HospitalEmployee> hospitalEmployees =
			new HashMap<String, HospitalEmployee>();
	
	//Create a Collection to show values
	public Collection<HospitalEmployee>allEmployees() {
		return hospitalEmployees.values();
	}
	
	//Be able to add an employee
	public void addEmployee(HospitalEmployee employee) {
		hospitalEmployees.put(employee.getEmpNumber(), employee);
	}
	//Be able to fire an employee
	public void fireEmployee(String empNumber) {
		hospitalEmployees.remove(empNumber);
	}
	

}
