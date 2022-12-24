import java.io.IOException;
import java.rmi.Naming;

public class Client {
	
	public static void main(String[] arg) throws IOException{
        System.out.println("Exo4 - Client : ");
      try {
    	  eEventLogger event = (eEventLogger) Naming.lookup ("//localhost/CompteCourant");
    	  event.makeNote("Note 1");
    	  event.makeNote("Note 2");
    	  event.makeNote("Note 3");
    	  event.makeNote("Note 4");
        System.out.println(event.getList());
      } catch(Exception e) {
          System.out.println("HelloClient exception: "+e);
      }
    }
}
