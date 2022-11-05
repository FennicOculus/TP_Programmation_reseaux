import java.util.Scanner;

public class Distributeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner myObj = new Scanner(System.in);
		
		System.out.println("Sasissez le nombre de producteur");
		int P = myObj.nextInt();
		
		System.out.println("Sasissez le nombre de Consommateur");
		int C = myObj.nextInt();
		
		System.out.println("Sasissez la taille de la File");
		int F = myObj.nextInt();*/
		
		int F = 10;
		int C = 5;
		int P = 5;
		
		File file = new File(F);
		Producteur prod = new Producteur(file);
		Consomateur con = new Consomateur(file);
		for (int i = 0 ; i < P ; i++) {
			Thread p = new Thread(prod);
			p.start();
		}
		
		for (int i = 0 ; i < C ; i++) {
			Thread c = new Thread(con);
			c.start();
		}
		
		
		
		
		
	}

}
