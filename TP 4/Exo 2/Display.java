import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Display extends Remote {
	
	double somme(double a, double b) throws RemoteException;
	double diff(double a, double b) throws RemoteException;
	double mult(double a, double b) throws RemoteException;
	double div(double a, double b) throws RemoteException;
	
	

}
