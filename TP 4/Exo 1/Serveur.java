import java.rmi.*;
import java.rmi.server.*;

public class Serveur {
	public static void main(String[] args){
		System.setProperty("java.security.policy", "C:\\Users\\Lina\\Desktop\\Sam\\Progs\\Java Progs\\TP 4 Exo 1\\src\\fichier.policy");

		try {
			System.out.println("Serveur : Construction de l’implémentation");
			Compte cpt= new Compte(15.50);
			System.out.println("Objet Compte enregistré dans RMIregistry");
			Naming.rebind("//localhost/CompteCourant", cpt);
			System.out.println("Attente des invocations des clients ");
		}
		catch (Exception e) {
		System.out.println("Erreur de liaison de l'objet Compte");
		System.out.println(e.toString());
		}
	} // fin du main

}
