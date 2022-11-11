package tp3_exo2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class serveur {
public static void main(String[] args) {
		
		try {
			// creation socket + assicoation port
			ServerSocket ss=new ServerSocket(5555);  
			
			// mise en ecoute + acceptation requete
			Socket s=ss.accept();
			
			// lire message client + affichage then repondre depuis console
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			Scanner message = new Scanner(System.in);
			String str ="";
			while(true) {
				
				str =(String) dis.readUTF();
				if(str.equals("end")) { 
					System.out.println("Bye client");
					break; }
				System.out.println("Ici serveur, message reçu du client = "+ str);
				
				// recuperation message utilisateur(console)
				System.out.println("(serveur)Saisssez votre message ici : ");
				String P = message.nextLine();
				
				// envoyer le message au client 
				dout.writeUTF(P);  
				dout.flush();
			}
			
			dout.close();   
			ss.close();  
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
