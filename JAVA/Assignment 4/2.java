import java.util.ArrayList;

public class lembdaAssignment2 {
	
	int price;
	String orderstatus;
	
	    
	
	public lembdaAssignment2(int price, String orderstatus) {
		super();
		this.price = price;
		this.orderstatus = orderstatus;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getOrderstatus() {
		return orderstatus;
	}



	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

   @Override
    public String toString() {
    	return price+""+orderstatus;
    }

	public static void main(String[] args) {
		
		
		ArrayList<lembdaAssignment2> order=new ArrayList<>();
		order.add(new lembdaAssignment2(150000, "Completed"));
        order.add(new lembdaAssignment2(100, "Accepted"));
        order.add(new lembdaAssignment2(10000, "Completed"));
        
        
        lembdacheck lembda= o -> (o.getPrice()>10000 &&( o.getOrderstatus().equals( "Completed" )|| o.getOrderstatus().equals( "Accepted")));
      
        for(lembdaAssignment2 obj: order) {
        	System.out.println(lembda.check(obj));
        }

		
	}
	
	@FunctionalInterface
	interface lembdacheck{
		
		boolean check(lembdaAssignment2 o);
		
	}

}
