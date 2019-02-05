package interfaces;

import server.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

import exceptions.InvalidLoginException;
import exceptions.InvalidSessionException;

public interface BankInterface extends Remote {

public long login(String username, String password) throws RemoteException, InvalidLoginException;

public void deposit(int accountnum, int amount, long sessionID) throws RemoteException, InvalidSessionException;

public void withdraw(int accountnum, int amount, long sessionID) throws RemoteException, InvalidSessionException;

public int inquiry(int accountnum, long sessionID) throws RemoteException, InvalidSessionException;

public Statement getStatement(Date from, Date to, long sessionID) throws RemoteException, InvalidSessionException;

}