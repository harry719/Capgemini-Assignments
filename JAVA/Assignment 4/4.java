import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class lembdaAssignment4 {
	
	

	private static String i;





	public lembdaAssignment4(String name) {
		super();
		this.name = name;
	}





	String name;
	
	    



	public static void main(String[] args) {
		
		
		ArrayList<String > order=new ArrayList<>();
		order.add("Completed");
        order.add("Harikripal");
        order.add("dinesh");
        //((i) -> ((i.length())%2!=0));

       
        Predicate<String> p=((i)-> ((i.length())%2!=0));
        order.removeIf(p);
        	       	
       
        	System.out.println(order);
         	 
        }
	

}