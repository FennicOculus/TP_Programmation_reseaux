import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Serveur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("java.security.policy", "C:\\Users\\Lina\\Desktop\\Sam\\Progs\\Java Progs\\TP 4 Exo2\\src\\fichier.policy");
			
		try {
			//Registry registry = LocateRegistry.createRegistry(3000);
			System.out.println("Serveur Exo 2: Construction de l’implémentation");
			Calcules obj= new Calcules();
			System.out.println("Objet objet enregistré dans RMIregistry");
			Naming.rebind("//localhost/CompteCourant", obj);
			System.out.println("Attente des invocations des clients ");
		}
		catch (Exception e) {
		System.out.println("Erreur de liaison de l'objet");
		System.out.println(e.toString());
		}

	}

}
