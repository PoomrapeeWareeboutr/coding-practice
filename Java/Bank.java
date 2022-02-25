import java.util.ArrayList;
import java.util.List;

public class Bank {
	//1.variable
	private ArrayList<BankAccount> accounts;
	//2.constructor
	public Bank(){
		accounts = new ArrayList<BankAccount>();
	}
	//3.methods
	//add an account to this bank
	public void addAccount(BankAccount a){
		accounts.add(a);
	}
	//gets the sum of the balances of all accounts in this bank
	public double getTotalBalance(){

		//**************** YOUR CODE HERE****************
		double totalBalance = 0;
		for(BankAccount acc : accounts) {
			totalBalance += acc.getBalance();
		}
		return totalBalance;
		//*********************************************
	}
	//counts the number of bank account whose balance is at least given value.
	public int countBalanceAtLeast(double atLeast){
		
		//**************** YOUR CODE HERE****************
		int count = 0;
		for(BankAccount acc : accounts) {
			if(acc.getBalance() >= 5_000) {
				count++;
			}
		}
		return count;
		//*********************************************
	}
	
	//finds a bank account with a given number
	public BankAccount find(int accountNumber){
		
		//**************** YOUR CODE HERE****************
		for(BankAccount acc : accounts) {
			if(acc.getAccountNumber() == accountNumber) {
				return acc;
			}
		}
		return null;
		//*********************************************
	}
	
	//gets the bank account with the largest balance.
	public BankAccount getMax(){

		//**************** YOUR CODE HERE****************
		BankAccount temp = null;
		double max = accounts.get(0).getBalance();
		for(BankAccount acc : accounts) {
			if(acc.getBalance() > max) {
				max = acc.getBalance();
				temp = acc;
			}
		}
		return temp;
		//*********************************************
	}
	
	//gets the bank account with the minimum balance.
	public BankAccount getMin(){
		
		//**************** YOUR CODE HERE****************
		BankAccount temp = null;
		double min = accounts.get(0).getBalance();
		for(BankAccount acc : accounts) {
			if(acc.getBalance() < min) {
				min = acc.getBalance();
				temp = acc;
			}
		}
		return temp;
		//*********************************************
	}
	
	//finds duplicate accounts by checking the account numbers in O(N) without using Set and Map
	//return the list of all the accounts that are later found to be duplicate, if there is no duplicate simply return an empty list
	public List<BankAccount> findDuplicate(){

		//**************** YOUR CODE HERE****************
		ArrayList<Integer> accNumber = new ArrayList<>();
		ArrayList<BankAccount> duplicateAcc = new ArrayList<>();

		for(BankAccount acc : accounts) {
			accNumber.add(acc.getAccountNumber());
			if(accNumber.indexOf(acc.getAccountNumber()) != accNumber.lastIndexOf(acc.getAccountNumber())) {
				duplicateAcc.add(acc);
			}
		}

		return duplicateAcc;
		//*********************************************
	}
}
