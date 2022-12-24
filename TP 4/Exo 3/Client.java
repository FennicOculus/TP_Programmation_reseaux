import java.io.IOException;
import java.rmi.Naming;

public class Client {
	
	public static void main(String[] arg) throws IOException{
        System.out.println("Exo3 - Client : ");
      try {
        Hello hello = (Hello) Naming.lookup ("//localhost/CompteCourant");
        System.out.println(hello.sayHello());
      } catch(Exception e) {
          System.out.println("HelloClient exception: "+e);
      }
    }
}
