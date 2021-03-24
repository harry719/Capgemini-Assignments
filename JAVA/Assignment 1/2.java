import java.util.Scanner;

public class main {

	public static void main(String[] args) {
  
		System.out.println("Armstrong Numbers Are:");
		
		
		for(int number=100;number<1000;number++) {

			int sum=0;
		for(int i=number;i!=0;i=i/10){
		
		int ti=i%10;  //getting last digit from it
		int temp=(ti*ti*ti);  // getting cube of it
		sum+=temp;  
		}
		
		if(sum==number){
			
		System.out.println(+sum);
		}
		}
	}

}
