import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class HashSet {

		
	public static void main(String[] args) {
	
		
		 LinkedHashSet<String> h=new LinkedHashSet();
		 h.add("monday");
		 h.add("tuesday");
		 h.add("wednesday");
		 h.add("thrusday");
		 h.add("friday");
		 h.add("saturday");
		 h.add("sunday");
		 
		 
		 Iterator<String> i=h.iterator();
		 System.out.println("days are following:->");
		 while(i.hasNext()) {
			 
			 System.out.println(i.next());
		 }
	}
}
