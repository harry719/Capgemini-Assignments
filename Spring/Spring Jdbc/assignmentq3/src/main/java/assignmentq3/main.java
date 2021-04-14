package assignmentq3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		BankAccountepositoryImpl b=(BankAccountepositoryImpl) context.getBean("Accounts");
		b.getBalance(1);
		
		
		
		
	}

}
