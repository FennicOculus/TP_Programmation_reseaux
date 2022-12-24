import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessegesImp extends UnicastRemoteObject implements Messeges {
	public String name;
	public Messeges client = null;
	
	protected MessegesImp(String n) throws RemoteException {
		super();
		this.name = n; 
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getName() throws RemoteException {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void send(String msg) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	@Override
	public void setClient(Messeges c) throws RemoteException {
		// TODO Auto-generated method stub
		client = c;
	}

	@Override
	public Messeges getClient() throws RemoteException {
		// TODO Auto-generated method stub
		return client;
	}
	

}
