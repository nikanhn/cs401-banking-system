public class Account {
	private int accountNum;
	private double balance;
	// private List<Transaction> to implement later
	
	public Account(int accountNum, double balance) {
		setAccount(accountNum);
		setBalance(balance);
	}
	
	public void setAccount(int account) {
		accountNum = account;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAccount() {
		return accountNum;
	}
	
	public double getBalance() {
		return balance;
	}
	public void deposit(double money) {
		balance += money;
	}
	public void withdrawal(double money) {
		if(balance >= money) {
			balance = balance - money;
		}
		else {
			throw new IndexOutOfBoundsException();
		}
	}
}
