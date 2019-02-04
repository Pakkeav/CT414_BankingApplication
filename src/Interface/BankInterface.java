package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

import Server.InvalidLogin;
import Server.InvalidSession;
import Server.Statement;

public interface BankInterface extends Remote {

public long login(String username, String password) throws RemoteException, InvalidLogin;
public double deposit(int accountnum, double amount, long sessionID) throws RemoteException, InvalidSession;
public double withdraw(int accountnum, double amount, long sessionID) throws RemoteException, InvalidSession;
public double inquiry(int accountnum, long sessionID) throws RemoteException, InvalidSession;

public Statement getStatement(Date from, Date to, long sessionID) throws RemoteException, InvalidSession;

}