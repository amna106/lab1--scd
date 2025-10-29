package lab1;

public class Receptionist extends user {
	int R_id;
	String R_name;
	public Receptionist(int R_id, String R_name) {
		this.R_id = R_id;
		this.R_name = R_name;
		}
	public void GiveAppoint() {
		System.out.println("Receptionist:" + R_name + " will give the appointment");
	}
	public void GenerateBill(Billing B) {
		System.out.println("Receptionist:" + R_name+ " will genrate the bill of patient:" + B.P_name);
	}

}
