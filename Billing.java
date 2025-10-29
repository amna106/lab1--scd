package lab1;

public class Billing {
	int B_no;
	int P_id;
	String P_name;
	float B_amt;
	public Billing(int B_no, int P_id, String P_name, float B_amt) {
		this.B_no = B_no;
		this.P_id = P_id;
		this.P_name = P_name;
		this.B_amt = B_amt;
	}
	public void ShowBill() {
		System.out.println("Bill No:" + B_no + ",PatientID:" + P_id +",Patient:" + P_name + ", Bill Amount:" + B_amt  );
	}

}
