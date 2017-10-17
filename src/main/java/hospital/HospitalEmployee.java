package hospital;

public abstract class HospitalEmployee {
	
	protected String empName;
	protected String empNumber;
	
	protected int patientHealth = 10;
	
	public HospitalEmployee(String empName, String empNumber) {
		this.empName = empName;
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpNumber() {
		return empNumber;
	}
	
	public int getPatientHealth() {
		return patientHealth;
	}
	
	abstract double calculatePay();
	
	
	@Override
	public String toString() {
		return empName + "\t" + empNumber;
	}

}
