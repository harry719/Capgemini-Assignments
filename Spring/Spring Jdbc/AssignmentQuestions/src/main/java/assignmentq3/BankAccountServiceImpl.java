package assignmentq3;

import java.util.List;

public class BankAccountServiceImpl implements BankAccountService{

	

	 public List<BankAccount> accounts;

	    public List<BankAccount> getAccounts() {
	        return accounts;
	    }

	    public void setAccounts(List<BankAccount> accounts) {
	        this.accounts = accounts;
	    }
	
	
	
	public double withdraw(long accountId, double balance) {
		for(BankAccount b: accounts) {
			if(b.getAccountId()==accountId) {
				if(b.getAccountBalance()>=balance) {
					
				
				double amount=b.getAccountBalance()-balance;
				b.setAccountBalance(amount);
				System.out.println("balance after Withdrawing of amount is:->"+b.getAccountBalance());
				}
			}
			
		}
		
		
		return 0;
	}

	public double deposit(long accountId, double balance) {
		
		for(BankAccount b: accounts) {
			if(b.getAccountId()==accountId) {
		
					
				
				double amount=b.getAccountBalance()+balance;
				b.setAccountBalance(amount);
				System.out.println("balance after deposit of amount is:->"+b.getAccountBalance());
				}
			
			
		}
		
		return 0;
	}

	public double getBalance(long accountId) {
		 for(BankAccount b: accounts) {
	    	  if(b.getAccountId()==accountId) {
	    		  System.out.println("account balance is:->"+b.getAccountBalance());
	    	  }
	      }
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		for(BankAccount b:accounts) {
			if(b.getAccountId()==fromAccount && b.getAccountId()==toAccount) {
		     toAccount=(long) (getBalance(toAccount)+amount);
				System.out.println("true");
			}
		}
		return false;
	}

}
