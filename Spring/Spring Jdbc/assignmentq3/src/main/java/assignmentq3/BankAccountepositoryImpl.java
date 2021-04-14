package assignmentq3;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class BankAccountepositoryImpl implements BankAccountRepository,ApplicationContextAware {
     
	private ApplicationContext context =null;
	 public List<BankAccount> accounts;

	    public List<BankAccount> getAccounts() {
	        return accounts;
	    }

	    public void setAccounts(List<BankAccount> accounts) {
	        this.accounts = accounts;
	    }
	
	
	
	
	public double getBalance(long accountId) {
      BankAccountepositoryImpl br=(BankAccountepositoryImpl) context.getBean("Accounts");	
      for(BankAccount b: br.accounts) {
    	  if(b.getAccountId()==accountId) {
    		  System.out.println("account balance is:->"+b.getAccountBalance());
    	  }
      }
      return 0;
	}

	public double updateBalance(long accountId, double newbalance) {
		BankAccountepositoryImpl br=(BankAccountepositoryImpl) context.getBean("Accounts");	
	      
		for(BankAccount b:br.accounts) {
			if(b.getAccountId()==accountId) {
			double	balance=b.getAccountBalance()+newbalance;
			b.setAccountBalance(balance);
			System.out.println("updated balance is:->"+b.getAccountBalance());
			}
		}
		return 0;
	}
	
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context=applicationContext;
	}

	

}
