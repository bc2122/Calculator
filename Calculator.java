import java.util.*;

class Calculator{
	public static void main(String... a){

		System.out.println("Enter two numbers: ");
		Scanner s= new Scanner(System.in);
		

		double first= s.nextDouble();
		double second= s.nextDouble();

		System.out.println("Enter the operation: +, -, /, *");
		char op= s.next().charAt(0);

	double result;

		switch (op){

			case '+' :
				result= first + second;
				break;

			case '-' :
				result= first- second;
				break;


			case '/' :
				result= first/second;
				break;


			case '*' :
				result= first * second;
				break;

			default:
				System.out.println("INVALID OPERATOR");
				return;
			}

	System.out.println(first+" "+op+" "+second+" = "+result);
	}
}

	