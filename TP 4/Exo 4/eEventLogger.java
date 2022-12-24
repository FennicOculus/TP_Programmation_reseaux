

public interface eEventLogger extends java.rmi.Remote {
    void makeNote(String note) throws java.rmi.RemoteException;
    String getList() throws java.rmi.RemoteException ;
    
}