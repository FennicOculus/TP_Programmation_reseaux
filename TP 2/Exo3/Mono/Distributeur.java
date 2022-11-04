
public class Distributeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producteur P = new Producteur();
		Consommateur C = new Consommateur(P);
		
		//Thread r1 = new Thread(P);
		//Thread r2 = new Thread(C);
		
		//r1.start();
		//r2.start();
		
		P.start();
		C.start();
		
	}

}
