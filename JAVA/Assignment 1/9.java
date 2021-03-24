import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	            
		        Scanner scan = new Scanner(System.in);

	        	int t1=0,t2=0,t3=0;
		        for (int i=0;i<3;i++)
		        {  
		        	System.out.println("Enter the marks of" +(i+1)+ "student:->");
		            int a = scan.nextInt();
		            t1+=a;
		            int b = scan.nextInt();
		            t2+=b;
		            int c = scan.nextInt();
		            t3+=c;
		            int total = a+b+c;
		            int average = total/3;
		            System.out.println("Total marks: "+total);
		            System.out.println("Average marks: "+average);
		        }
		        //subject1
		        System.out.println("total in subject A:->"+t1);
		        System.out.println("Average in subject A:->"+(t1/3));
	            
                      //subject2
		        System.out.println("total in subject A:->"+t2);
		        System.out.println("Average in subject A:->"+(t2/3));
		 
                    //subject3
		        System.out.println("total in subject A:->"+t3);
		        System.out.println("Average in subject A:->"+(t3/3));
		    
	
	}
			
	
	}
	
