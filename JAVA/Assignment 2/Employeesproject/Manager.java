
public class Manager extends employee {
     
	private int  incentive=0;
	
	public Manager(int basesalary ) {
		super(basesalary);
		this.incentive=incentive;
		
	}
	
 		public void setincentive(int addincentive) {
             incentive=incentive+addincentive;		
	}

	@Override
	public int salary() {
		return super.salary()+incentive;
	}
	
	
	

}
