package Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

import Interface.BankInterface;

public class Bank extends UnicastRemoteObject implements BankInterface {

	private List<Account> accounts; // users accounts
	
	public Bank() throws RemoteException{
	
	}
	public void deposit(int account, int amount) throws RemoteException, InvalidSession {	
		// implementation code
	
	}
	
	public void withdraw(int account, int amount) throws RemoteException, InvalidSession {	
		// implementation code
	
	}
	
	public int inquiry(int account) throws RemoteException, InvalidSession {
		return account;	
		// implementation code
	
	}
	
	public Statement getStatement(Date from, Date to) throws RemoteException, InvalidSession {
		return null;
	
		// implementation code
	
	}
	
	public static void main(String args[]) throws Exception {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());			// initialise Bank server
		}
		try {
            String name = "Bank";
            BankInterface stub = new Bank();
           // Compute stub = (Compute) UnicastRemoteObject.exportObject(engine, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, stub);
            System.out.println("Bank bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }
	}
	@Override
	public  long login(String username, String password) throws RemoteException, InvalidLogin {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double deposit(int accountnum, double amount, long sessionID) throws RemoteException, InvalidSession {
		return 0;
		// TODO Auto-generated method stub
		
	}
	@Override
	public double withdraw(int accountnum, double amount, long sessionID) throws RemoteException, InvalidSession {
		return 0;
		// TODO Auto-generated method stub
		
	}
	@Override
	public double inquiry(int accountnum, long sessionID) throws RemoteException, InvalidSession {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Statement getStatement(Date from, Date to, long sessionID) throws RemoteException, InvalidSession {
		// TODO Auto-generated method stub
		return null;
	}

}
