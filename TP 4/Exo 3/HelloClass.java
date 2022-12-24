import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloClass extends UnicastRemoteObject implements Hello{
	private String message;
	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return message;
	}
	
	public HelloClass(String msg) throws RemoteException {
	    message = msg; 
	}

}
