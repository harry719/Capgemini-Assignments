import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		System.out.println("Welcome to CUI:");
		int i;
		String uname = null;
		for(i=0;i<3;i++) {
		System.out.println("Enter the username:");
		Scanner sc=new Scanner(System.in);
		 uname=sc.nextLine();

		System.out.println("Enter the password:");
		Scanner sc1=new Scanner(System.in);
		String password=sc1.nextLine();
		
			if((uname.equals("Hari@123") && (password.equals("12345")))) {
		       
				System.out.println("Welcome:"+uname);
				 break;
			}
			else if (i==3) {
				 System.out.println("Contact Admin");

				
			}
			else {
				System.out.println("try again");
			}
		}
		
			
        
		}
    	
        
		
	
	}
	