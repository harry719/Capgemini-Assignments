
public class lembda1Assignment {

	
	
	public static void main(String[] args) {
		Lembdaoperation add=(int a,int b)-> a+b;
		Lembdaoperation divide=(int a,int b)-> a/b;
		Lembdaoperation multiply=(int a,int b)-> a*b;
		Lembdaoperation substract=(int a,int b)-> a-b;
		System.out.println(add.operation(5, 10));
		System.out.println(divide.operation(10, 5));
        System.out.println(multiply.operation(5, 7));
        System.out.println(substract.operation(500, 48));
	}
}
interface Lembdaoperation{
int operation(int a,int b);	
}