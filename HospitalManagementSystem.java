package lab1;

public class HospitalManagementSystem {
	public static void main(String[] args) {
		Doctor D = new Doctor( 101, "Amna");
		Patient P = new Patient( 201, "Maha");
		Receptionist R = new Receptionist( 301, "Mariam" );
		Billing B = new Billing( 401, P.P_id, P.P_name, 3000);
		
		D.CheckPatient(P);
		P.PayBill(B);
		R.GiveAppoint();
		R.GenerateBill(B);
		B.ShowBill();
		
	}

}
