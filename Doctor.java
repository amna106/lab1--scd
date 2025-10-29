package lab1;

public class Doctor extends user{
	int D_id;
	String D_name;
	public Doctor(int D_id, String D_name) {
		this.D_id = D_id;
		this.D_name = D_name;
	}
	public void CheckPatient(Patient P) {
		System.out.println(D_name+" will check the: " + P.P_name);
	}

}
