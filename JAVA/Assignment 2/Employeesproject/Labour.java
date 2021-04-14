
public class Labour extends employee {
	   
	private  int overtime=0;;
    
	public Labour(int basesalary) {
		super(basesalary);
		this.overtime=overtime;
		}
      
	public void setovertime(int newovertime) {
		overtime=overtime+newovertime;
	}

	@Override
	public int salary() {
		return super.salary()+overtime;
	}
	
	
	
}
