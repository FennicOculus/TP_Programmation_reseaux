import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] argv) throws IOException {
		// TODO Auto-generated method stub
		 	
			try {
				Display dsp = (Display) Naming.lookup("//localhost/CompteCourant");
				int a = 10;
				int b = 5;
				System.out.println ("La somme "+a+" + "+b+" = "+dsp.somme(a, b));
				System.out.println ("La difference "+a+" - "+b+" = "+dsp.diff(a, b));
				System.out.println ("La multiplication "+a+" * "+b+" = "+dsp.mult(a, b));
				System.out.println ("La division "+a+" / "+b+" = "+dsp.div(a, b));
			}catch (Exception e) {
				System.out.println("Erreur d'acces a un objet distant");
				System.out.println(e.toString());
			}
	}

}
