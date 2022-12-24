import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calcules extends UnicastRemoteObject implements Display {
	
	private static final long serialVersionUID = 1L;

	public Calcules () throws RemoteException {
		super();
	}
	
	@Override
	public double somme(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double diff(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mult(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		if (b != 0 ){
	          return (a / b);  
	        }
	        System.out.println("denominateur = 0");
	        return 0 ;
	}

}
