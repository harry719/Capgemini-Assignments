
        import java.util.ArrayList;
        import java.util.Collection;
import java.util.function.Consumer;
        
        public class lembdaAssignment5 {
        	
        	

                	public static void main(String[] args) {
        		
        		
        		ArrayList<String > l=new ArrayList<>();
        		StringBuilder s=new StringBuilder();
        		l.add("Completed");
                l.add("Harikripal");
                l.add("dinesh");
                //((i) -> ((i.length())%2!=0));
               Consumer<String> lembda=(i)->s.append(i.charAt(0));
               for(String str:l) {
            	   lembda.accept(str);
               }
               System.out.println("Srting is:"+s); 
               }
                	}