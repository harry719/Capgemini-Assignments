
public class current extends bank {

	private int cashcredit=0;
	
	public current(int cash) {
		super(cash);
	this.cashcredit=cashcredit;	
	}
	public void credit(int addcash) {
		cashcredit=cashcredit+addcash;
	}
	@Override
	public int tcash() {
		// TODO Auto-generated method stub
		return cashcredit;
	}
	
	

	
}
