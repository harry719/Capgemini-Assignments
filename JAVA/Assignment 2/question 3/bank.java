
public class bank {
	private int cash;
	
	
	
	public bank(int cash) {
		
		this.cash = cash;
	}
	public int tcash() {
		return cash;
	}



	public static void main(String[] args) {
		
		saving s= new saving(0);
		current c=new current(0);
	    s.deposit(15000);
	    c.credit(50000);
	    
		System.out.println("total cash in the bank:"+(s.tcash()+c.tcash()));
	}

}
