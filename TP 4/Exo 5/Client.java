import java.io.IOException;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] arg) throws IOException{
        
      try {
    	  System.out.println("Exo4 - Client : ");
          Scanner myObj = new Scanner(System.in);
          System.out.println("Saisissez votre nom");
          String name = myObj.nextLine();
          Messeges client = new MessegesImp(name);
          
    	  Messeges message = (Messeges) Naming.lookup ("//localhost/CompteCourant");
    	  
    	  String msg = "["+client.getName()+"] is connected";
    	  
    	  message.send(msg);
    	  System.out.println("[System] Le CHAT est prêt:");
    	  message.setClient(client);
    	  
    	  
    	  while (message.equals("End") == false) {
    		  System.out.print(client.getName()+" : ");
    		  msg = myObj.nextLine();
              msg = "["+client.getName()+"] "+msg;            
              message.send(msg);
    	  }
    	  
      } catch(Exception e) {
          System.out.println("HelloClient exception: "+e);
      }
    }
}
