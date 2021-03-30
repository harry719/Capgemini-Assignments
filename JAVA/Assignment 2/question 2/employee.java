
public class employee {
	
	
	private int basesalary;
	
	
	
	public employee(int basesalary) {
		this.basesalary = basesalary;
	}
	public int salary() {
		return basesalary;
	}
	
	public static void main(String[] args) {
		
		System.out.println("TOTAL SALARY ");
		Manager m= new Manager(15000);
		Labour l=new Labour(10000);
		m.setincentive(5000);
		l.setovertime(2000);
		System.out.println("Salary of Manager:->"+m.salary());
		
		System.out.println("Salary of Labour"+l.salary());
		
	}

}
