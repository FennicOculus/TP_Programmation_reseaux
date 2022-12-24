import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	public static void main(String[] args) {
		
		try {
			// creation socket + connexion port
			Socket socket=new Socket("localhost",5555);  
			DataInputStream dis=new DataInputStream(socket.getInputStream());  
			DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
			
			// ecrire message depuis console et l'envoyer au serveur
			Scanner message = new Scanner(System.in);
			String  str = "";
			String P = "";
			while(true) {
				System.out.println("(client) Saisssez votre message ici : ");
				P = message.nextLine();
				// envoyer au serveur
				dout.writeUTF(P);  
				dout.flush();
				
				// test de sortie
				if(P.equals("bye") || P.equals("null")) { 
					System.out.println("Bye serveur");
					break; }
				
				// intercepter reponse du serveur et l'afficher
				str =(String) dis.readUTF();  
				System.out.println("(CLIENT) message reçu du serveur = "+str);
				
				
			}
			socket.close(); 
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
