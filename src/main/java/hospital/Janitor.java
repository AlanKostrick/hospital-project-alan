package hospital;

public class Janitor extends HospitalEmployee {

	protected boolean isSweeping;
	
	public Janitor(String empName, String empNumber, boolean isSweeping) {
		super(empName, empNumber);
		this.isSweeping = isSweeping;
	}
	
	public boolean checkIfSweeping() {
		return isSweeping;
	}

	@Override
	double calculatePay() {
		return 40000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + isSweeping;
	}
	
	

}
