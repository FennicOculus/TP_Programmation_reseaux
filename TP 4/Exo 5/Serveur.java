import java.rmi.Naming;
import java.util.Scanner;

public class Serveur {
	public static void main(String[] args){
		System.setProperty("java.security.policy", "C:\\Users\\Lina\\Desktop\\Sam\\Progs\\Java Progs\\TP 4 Exo5\\src\\fichier.policy");
		
		try {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Entrez votre nom et appuyez sur Entrée:");
	        String name=s.nextLine().trim();
	        MessegesImp server = new MessegesImp(name); 
	        Naming.rebind("//localhost/CompteCourant", server);
	        
	        System.out.println("Le chat coté servur est prêt:");
	        String msg = "";
	        while(msg.equals("End") == false){
	        	System.out.print(server.getName()+" : ");
	            msg = s.nextLine().trim();
	            if (server.getClient() != null){
	            	Messeges client = server.getClient();
	              msg = "["+server.getName()+"] "+msg;
	              client.send(msg);
	            }  
	          }
		}
		catch (Exception e) {
		System.out.println("Erreur de liaison de l'objet");
		System.out.println(e.toString());
		}
	        }

}
