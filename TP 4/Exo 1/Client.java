import java.io.*;
import java.rmi.*;

public class Client {
	
	public static void main (String [] argv) throws IOException{
		if(argv.length != 2){
			System.out.println("Usage : java Client <nombre> <operation>");
			System.exit(1);
		}
		// operation = 1: credit, 2: dedit
		//System.setSecurityManager(new RMISecurityManager());
		
		//System.setProperty("java.security.policy", "C:\\Users\\Lina\\Desktop\\Sam\\Progs\\Java Progs\\TP 4 Exo 1\\src\\fichier.policy");
		//System.setProperty("java.rmi.server.hostname", "192.168.56.1");
		double valeur = Double.parseDouble(argv[0]);
		int operation = Integer.parseInt(argv[1]);
		try {
			CompteInterface cpt= (CompteInterface) Naming.lookup("//localhost/CompteCourant");
			if (operation==1) 
				cpt.crediter(valeur);
			if (operation ==2) 
				cpt.debiter(valeur);
			System.out.println ("Votre solde courant = " +
			cpt.lire_solde() + " euros");
		}catch (Exception e) {
			System.out.println("Erreur d'acces a un objet distant");
			System.out.println(e.toString());
		}
	}
}
