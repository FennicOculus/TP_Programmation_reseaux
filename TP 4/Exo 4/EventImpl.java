import java.rmi.*;
import java.rmi.server.*;
public class EventImpl extends UnicastRemoteObject implements eEventLogger {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logs = "";
    
    public EventImpl() throws RemoteException {
        super();    
        }

    @Override
    public String getList() throws RemoteException {
        return logs ; 
    }

	@Override
	public void makeNote(String note) throws RemoteException {
		// TODO Auto-generated method stub
		logs = logs.concat(note+"\n");
	}
}
