import java.util.Scanner;

public class main {

	public static void main(String[] args) {
  
		System.out.println("Enter the number to be checked:");
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		for(int i=number;i!=0;i=i/10){
		
		int ti=i%10;  //getting last digit from it
		int temp=(ti*ti*ti);  // getting cube of it
		sum+=temp;  
		}
		
		if(sum==number){
			
		
		System.out.println("number"+sum+"is armstrong number");
		}
		else {
		System.out.println("number is not armstrong number");}
	}

}
