package hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties {

	protected String speciality;
	
	public Doctor(String empName, String empNumber, String speciality) {
		super(empName,empNumber);
		this.speciality = speciality;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	@Override
	double calculatePay() {
		return 90000;
	}
	
	@Override
	public boolean drawBlood() {
		return true;
	}
	
	@Override
	public void careForPatient() {
		patientHealth *=2;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " \t" + speciality;
	}
	

}
