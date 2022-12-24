import java.rmi.*;

public interface Messeges extends Remote {
	public String getName() throws RemoteException;
	public void send(String msg) throws RemoteException;
	public void setClient(Messeges c) throws RemoteException;
	public Messeges getClient() throws RemoteException;
}
