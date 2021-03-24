import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		
      System.out.println("Enter the Element to be searched:->");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a[]= {12,45,32,56,76,19,122,90,877,23,67,49,78,78,234,654};
		int i;
		for (i=0;i<(a.length);i++)
		{
			if(a[i]==num) {
				System.out.println("element found at index:"+i);
				break;
				
			}}
	      System.out.println("Element not Found in given Array");
		
		
		
	
	}
}