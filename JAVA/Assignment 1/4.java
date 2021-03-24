import java.util.Scanner;
public class main {

	public static void main(String[] args) {
  
		System.out.println("Enter the marks of subjects:");
		System.out.println("Enter marks in english");
		
		Scanner sc=new Scanner(System.in);
		int e=sc.nextInt();
        System.out.println("Enter marks in Science ");
		
		Scanner sc1=new Scanner(System.in);
		int s=sc1.nextInt();
        System.out.println("Enter marks in Maths");
		
		Scanner sc2=new Scanner(System.in);
		int m=sc2.nextInt();
		
		
		if(e>60 && s>60 && m>60) {
			System.out.println("passed");
			
		}
		else if(e>60 && s>60 && m<60 || e>60 && s<60 && m>60 || e<60 && s>60 && m>60) {
			System.out.println("promoted");
		}
		else
		{
			System.out.println("failed");
		}
		

		
		
		
		
		
		
		
	}

}
