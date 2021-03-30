
        import java.util.ArrayList;
        import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
        
        public class lembdaAssignment5 {
        	
        	

                	public static void main(String[] args) {
        		
        		
        		ArrayList<String > l=new ArrayList<>();
        		
        		l.add("Completed");
                l.add("Harikripal");
                l.add("dinesh");
                UnaryOperator<String> unary=i->i.toUpperCase();
               l.replaceAll(unary);
               System.out.println("Srting is:"+l); 
               }
                	}