import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lembdaAssignmnt3 {
	
	
	
	
	public static void main(String[] args) {
       //supplier methid
		
		Supplier<LocalDateTime> supplier= ()->{
			return LocalDateTime.now();
		};

		System.out.println(supplier.get());
	///consumer method
	     Consumer<String> consumer=(t)->System.out.println(t);
	     consumer.accept("hari kripal");
	  //fucntional interface
	     Function<String, Integer> function=(t)->t.length();
	System.out.println(function.apply("Hari kripal kumawat"));     
	//Predicate method
	Predicate<Integer> predicate=(t)->{
		if(t%2==0) {
			return true;
		}else {
			return false;
		}
	};
	System.out.println(predicate.test(100));
	}
	
	
	
	
	

}
