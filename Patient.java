package lab1;

public class Patient extends user {
	int P_id;
	String P_name;
	public Patient(int P_id, String P_name) {
		this.P_id = P_id;
		this.P_name = P_name;
	}
	public void PayBill(Billing B) {
		System.out.println(P_name+ "will pay the bill of amount" + B.B_amt);
	}

}
