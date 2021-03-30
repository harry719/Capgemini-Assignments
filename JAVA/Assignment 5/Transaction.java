
public class Transaction {

	Trader trade;
	private int year;
	private int value;
	
	
	
	
	
	public Transaction(Trader trade, int year, int value) {
		super();
		this.trade = trade;
		this.year = year;
		this.value = value;
	}
	public Trader getTrade() {
		return trade;
	}
	public void setTrade(Trader trade) {
		this.trade = trade;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		return trade+""+year+""+value;
	}
}
