import java.rmi.Naming;

public class Serveur {
	public static void main(String[] args){
		//System.setSecurityManager(new RMISecurityManager());
	    //System.setProperty("java.security.policy","C:\\Users\\ASUS\\Documents\\NetBeansProjects\\TP_RMI\\build\\classes\\Exo1\\fichier.policy");
		System.setProperty("java.security.policy", "C:\\Users\\Lina\\Desktop\\Sam\\Progs\\Java Progs\\TP 4 Exo3\\src\\fichier.policy");
		
		try {
			System.out.println("Serveur Exo 3: Construction de l’implémentation");
			System.out.println("Objet objet enregistré dans RMIregistry");
			HelloClass obj = new HelloClass("Hello world");
			Naming.rebind("//localhost/CompteCourant", obj);
			System.out.println("Attente des invocations des clients ");
		}
		catch (Exception e) {
		System.out.println("Erreur de liaison de l'objet");
		System.out.println(e.toString());
		}
	        }

}
