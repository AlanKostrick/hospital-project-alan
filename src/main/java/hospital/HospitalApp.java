package hospital;

public class HospitalApp {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();

		Doctor phil = new Doctor("Phil", "111", "Brain");
		Surgeon harrison = new Surgeon("Harry", "222", "Plastic", true);
		Nurse jackie = new Nurse("Jackie", "333", 6);
		Receptionist janine = new Receptionist("Janine", "444", true);
		Janitor rosie = new Janitor("Rosie", "555", true);

		hospital.addEmployee(phil);
		hospital.addEmployee(harrison);
		hospital.addEmployee(jackie);
		hospital.addEmployee(janine);
		hospital.addEmployee(rosie);
		
		System.out.println("Here are the employees at High St. Hospital.");
		for(HospitalEmployee currentEmp: hospital.allEmployees()) {
			System.out.println(currentEmp);
		}
		
		System.out.println("\nHere are the pay rates at High St. Hospital.");
		for(HospitalEmployee currentEmp: hospital.allEmployees()) {
			System.out.println(currentEmp.getEmpName() + " gets paid a " +
		        " salary of " + currentEmp.calculatePay());
		}
		
		System.out.println("\nSome employees can administer patient care.");
		for(HospitalEmployee currentEmp: hospital.allEmployees()) {
			if(currentEmp instanceof MedicalDuties) {
				((MedicalDuties)currentEmp).careForPatient();
				System.out.println(currentEmp.getEmpName() + " has increased "
						+ " patient health to " + currentEmp.getPatientHealth());
		}
		}
		
	
		
		
		
	}
}