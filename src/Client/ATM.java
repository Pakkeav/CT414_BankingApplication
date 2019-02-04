package Client;

import java.io.*;
import java.rmi.registry.*;

import Interface.BankInterface;

public class ATM {
	
		// get userï¿½s input, and perform the operations

		//This is a test

	
	static long sessID;

	public static void main(String args[]) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String name = "Bank";
			Registry registry = LocateRegistry.getRegistry(args[0]);
			BankInterface bankInterface = (BankInterface) registry.lookup(name);
			
			System.out.println("\nEnter the userName:"); 
			String userName=br.readLine(); 
			System.out.println("\nEnter the password:"); 
			int PW = Integer.parseInt(br.readLine());
			System.out.println("\nEnter the account number:"); 
			int accNum = Integer.parseInt(br.readLine());
			System.out.println("\nEnter the initial amount in account:"); 
			int amt = Integer.parseInt(br.readLine());
			System.out.println("\t 1: Deposit \t 2: Withdrawal \t 3: Inquiry \t 4: Exit");
			int Option = Integer.parseInt(br.readLine());
			
			switch (Option) {
				case 1:
					System.out.println("Enter amount to deposit: "); 
					double deposit = Integer.parseInt(br.readLine()); 
					
					double balAfterDp = bankInterface.deposit(accNum, deposit, sessID);
					System.out.println("Current balance after deposit: €" + balAfterDp);
				break;
				case 2:
					System.out.println("Enter amount to withdraw: "); 
					double withdrawal = Integer.parseInt(br.readLine()); 
					
					double balAfterWd = bankInterface.withdraw(accNum, withdrawal, sessID);
					System.out.println("Current balance after deposit: €" + balAfterWd);
				break;
				case 3:
					double currentBalance = bankInterface.inquiry(accNum, sessID);
					System.out.println("Current balance: €" + currentBalance);
			}
		} catch (Exception e) {
	            System.err.println("ATM exception:");
	            e.printStackTrace();
		}
	} 
}