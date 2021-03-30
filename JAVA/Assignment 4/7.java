import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class lembdaAssignment7 {
        	
        	
        	public static void main(String[] args) {
				LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();
				
				m.put(1, "Hari");
				m.put(2,"Kripal");
				m.put(3, "Kumawat");
				StringBuilder str=new 	StringBuilder();
				//using entry set() to get the entry's of the map
				Set<Map.Entry<Integer,String>> s=m.entrySet();
				for(Map.Entry<Integer, String> i:s)
				{
					str.append(i.getKey()).append(i.getValue());
					
				}
				System.out.println("String is:->"+str);
				
			}
          	
        }