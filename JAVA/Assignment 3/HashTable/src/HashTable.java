import java.util.HashMap;

public class HashTable {
	
	private int date;
	private int month;
	private int year;
	private String name;
    String dob;
	
	
	public HashTable(int date, int month, int year,String name) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}


	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

     public void  string () {
    	 
    	 dob=this.getDate()+"/"+this.getMonth()+"/"+this.getYear();
    			
    	 
     }
	
	public String getDob() {
		return dob;
	}



	public static void main(String[] args) {
		
		
	   HashTable dob=new HashTable(19, 03, 1997,"Ankit"); 
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put(dob.getDob(), dob.getName());
		hm.put("15/03/2004", "dinesh");
		hm.put("15/03/2004", "dinesh1");
		hm.put("15/03/2004", "dinesh2");

		hm.put("15/03/2004", "dinesh3");

		hm.put("15/03/2004", "dinesh4");
		
		
		System.out.println("names and date"+hm);

	
		
	
	
	}



	
}
