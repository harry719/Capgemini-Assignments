import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
	
	
	
	private static long word;
	private static Map<Object, Long> commentbyuser;

	public static void main(String[] args) {
		
		List<Fruit> f=new ArrayList<>();
		f.add(new Fruit("Mango", 150, 100, "Yellow"));
		f.add(new Fruit("grapes", 70, 50, "Green"));
		f.add(new Fruit("Apple", 80, 80, "Red"));
		f.add(new Fruit("Orange", 200, 40, "orange"));
		f.add(new Fruit("berry", 84, 45, "Red"));
		
	//question 1 of assignment 	
		
		System.out.println("Assigment question 1 soltion;->");
		
	List<Fruit> l1=f.stream().filter(p->p.getCalories()<100).sorted(new Comparator<Fruit>() {
		@Override
		public int compare(Fruit o1,Fruit o2) {
	        return o2.getCalories() > o1.getCalories() ? 1 : -1;
        }
    }).collect(Collectors.toList());
    l1.forEach(System.out::println);

		
	
	//queston 2 of assignment 
	
	System.out.println("Assignment  quesiton 2 solution:->");
	Collections.sort(f, ( o1,  o2) ->(int) (o1.getColor().compareTo(o2.getColor())));
	System.out.println(f);
	
	
	
	//question 3 of assignment
    
    
    
    System.out.println("Assignment Question 3 solution:->");
	
	List<Fruit> l3=f.stream().filter(p->p.getColor().equals("Red")).sorted(new Comparator<Fruit>() {
		public int compare(Fruit o1, Fruit o2) {
			return o2.getPrice() > o1.getPrice()?1:-1;
		}
	}).collect(Collectors.toList());
	l3.forEach(System.out::println);
	
	
	
	
	
	//question 4
	System.out.println("Assignment Question 4 solution:->");
	List<News> n=new ArrayList<>(); 
	n.add(new News(1, "hari", "kunal", "perfect article in budget"));
	n.add(new News(2,"gaurav","ekta","not upto the standard budget"));
	n.add(new News(1, "kunal", "hari", "good collection of information"));
	n.add(new News(5, "radhika", "kartik", "Make some changes in it"));
	//for counting values
	System.out.println(n.stream().collect(Collectors.groupingBy((p)->p.getNewsId(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
	
    //question 5
	System.out.println("Assignment Question 5 solution:->");
	System.out.println(( word=n.stream().filter(p->p.getComment().contains("budget")).count()));
	
	
//question 6
	System.out.println("Assignment Question 6 solution:->");
	System.out.println(n.stream().collect(Collectors.groupingBy((p)->p.getPostedByUser(),Collectors.counting())));
	
	//question 7
		System.out.println("Assignment Question 7 solution:->");
		System.out.println(commentbyuser=n.stream().collect(Collectors.groupingBy((p)->p.getCommentByUser(),Collectors.counting())));
	
		
		//question of trade set
		
		List<Transaction> t=new ArrayList<>();
		t.add(new Transaction(new Trader("hari", "bundi"), 2010, 150000));

		t.add(new Transaction(new Trader("ibbi", "kota"), 2011, 50000));

		t.add(new Transaction(new Trader("gaurav", "Delhi"), 2020, 48000));

		t.add(new Transaction(new Trader("ankit", "jaipur"), 2018, 48750));
		
	
		
		
		//question 8
         System.out.println("Assignment Question 8 solution:->");
		 t.stream().filter(p->p.getYear()==2011).sorted(new Comparator<Transaction>() {
	             
			 @Override
				public int compare(Transaction o1, Transaction o2) {
		
					return o2.getValue() < o1.getValue() ? 1 : -1;
				}
	        }).forEach(System.out::println);
		 
		 
		 //question 9
		 System.out.println("Assignment Question 9 solution:->");
	        System.out.println(t.stream().map((Transaction t1)->t1.getTrade()).map((Trader t2)->t2.getCity()).distinct().collect(Collectors.toList()));		 
		 
		 //question 10
		 System.out.println("Assignment Question 10 solution:->");
		 System.out.println(t.stream().filter((p)->p.getTrade().getCity().equals("Pune")).map((p)->p.getTrade()).collect(Collectors.toList()));
		
		 
		 //question 11

		 System.out.println("Assignment Question 11 solution:->");
         System.out.println(t.stream().sorted(new Comparator<Transaction>() {
	             
			 @Override
				public int compare(Transaction o1, Transaction o2) {
		
					return (o2.getTrade().getName()).compareTo(o1.getTrade().getName()) ;
					}
				}
	));
         
		 
		
		 
		//question 12
         System.out.println("Assignment Question 12 solution:->");
		 System.out.println(t.stream().filter(p->p.getTrade().getCity()=="Indore").findAny());
		 
		 
		 
		 //question 13
		 System.out.println("Assignment Question 13 solution:->");
         System.out.println(t.stream().filter(p->p.getTrade().getCity()=="Delhi").findAny());
         
         //question 14
         System.out.println("Assignment Question 14 solution:->");
         System.out.println(t.stream().collect(Collectors.groupingBy((p)->p.getValue(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByKey()).get().getKey());
     	
         //question 15
         System.out.println("Assignment Question 15 solution:->");
         System.out.println(t.stream().collect(Collectors.groupingBy((p)->p.getValue(),Collectors.counting())).entrySet().stream().min(Map.Entry.comparingByKey()).get().getKey());
      	
	
	
	}
}