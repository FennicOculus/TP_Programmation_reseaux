import java.rmi.*;
import java.rmi.server.*;

public class Compte extends UnicastRemoteObject implements CompteInterface{
	
	private static final long serialVersionUID = 1L;
	private double solde;
	public Compte(double s) throws RemoteException
	{
		super();
		solde=s;
	}
	public void crediter(double montant) throws RemoteException{
		solde=solde+montant;
	}
	public void debiter(double montant) throws RemoteException
	{
		solde=solde-montant;
	}
	public double lire_solde() throws java.rmi.RemoteException{
		return solde;
	}
}
