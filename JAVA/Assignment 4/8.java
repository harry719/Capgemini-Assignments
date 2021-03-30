
        import java.util.ArrayList;
       
import java.util.function.Consumer;

        
        public class lembdaAssignment5 {
          	
         public void run(int l1) {
        	 
        	 
        	 Consumer<Integer> lembda=(o)->System.out.println(o);
         	lembda.accept(l1);
        	 
        	
         }
                	public static void main(String[] args) {
        		
                		 lembdaAssignment5 thread=new  lembdaAssignment5();
        		ArrayList<Integer > l=new ArrayList<>();
        		
        		l.add(1);

        		l.add(5);

        		l.add(10);

        		l.add(15);
        		l.add(20);
        		l.add(25);
        		l.add(30);

        		for(Integer l1:l){
                    thread.run(l1);
                	}
                	}
                	
              	 
        	 
         }
    