
public class saving extends bank{
    

	private int fixeddeposit=0;
	
	public saving(int cash) {
		super(cash);
		this.fixeddeposit=fixeddeposit;
	}
	

	public void deposit(int adddeposit) {
		fixeddeposit=fixeddeposit+adddeposit;
		
	}

	@Override
	public int tcash() {
		return fixeddeposit;
	}
	
	
	
	
}
