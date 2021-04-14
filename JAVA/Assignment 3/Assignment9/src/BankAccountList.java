import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class BankAccountList {
	
 
	
	public static void main(String[] args) {
		SortedSet<SavingAccount> ts=new TreeSet<SavingAccount>();
		SavingAccount s1=new SavingAccount(5000,110,"Ankit",false);

		SavingAccount s2=new SavingAccount(50000,102,"harry",true);

		SavingAccount s3=new SavingAccount(78521,104,"dkd",false);

		SavingAccount s4=new SavingAccount(5048,107,"Ekta",true);

		SavingAccount s5=new SavingAccount(254987,118,"guarav",true);
		s2.withdraw( 20000);
		ts.add(s1);
		ts.add(s5);
		s4.deposit(7000);
		ts.add(s4);
		ts.add(s3);
		ts.add(s2);
		
		for(SavingAccount s:ts) {
			
			System.out.println("Account number:->"+s.getAcc_ID()+"Account holder name::"+s.getAccountHoldername()+"account balance:->"+s.getAcc_balance());
			
			
		}
		
		System.out.println();
	
	
	}

}
