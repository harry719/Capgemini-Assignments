
public class SavingAccount implements Comparable<SavingAccount>{
     
	   private int acc_balance=0;
	   private int acc_ID;
	   private String accountHoldername;
	   private boolean isSalaryAccount;

	   
	   
	   public SavingAccount(int acc_balance, int acc_ID, String accountHoldername, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.isSalaryAccount = isSalaryAccount;
	}



	public int getAcc_balance() {
		return acc_balance;
	}



	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}



	public int getAcc_ID() {
		return acc_ID;
	}



	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}



	public String getAccountHoldername() {
		return accountHoldername;
	}



	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}



	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}



	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	} 
	   
	public void withdraw(int amount) {
		if(acc_balance < amount) {
        System.out.println("Low balance cannt processed with transaction");			
		}
		acc_balance=acc_balance-amount;
	}
	public void deposit(int amount) {
		acc_balance+=amount;
	}



	@Override
	public int compareTo(SavingAccount o) {
		if(acc_ID ==o.getAcc_ID()) {
			return 1;
		}
		else if(acc_ID<o.getAcc_ID()) {
			return -1;
			
		}
		else {
		return 0;
		}
	}
}
	
	
