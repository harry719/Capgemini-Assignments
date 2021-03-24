import java.util.Scanner;
public class main {

	public static void main(String[] args) {
  
		System.out.println("Enter the amount:");
		
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		
        System.out.println("Enter the rate:");
		
		Scanner sc1=new Scanner(System.in);
		double r=sc1.nextInt();
		
        System.out.println("Enter the time:");
		
		Scanner sc2=new Scanner(System.in);
		int t=sc2.nextInt();

		System.out.println("calculated simple intrest:"+((p*r*t)/100));
        r=1+(r/100);
		r=Math.pow(r, t);
		System.out.println("calculated compound intrest:"+((p*r)-p));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
