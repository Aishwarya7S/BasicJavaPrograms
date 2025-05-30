package basicJavaPrograms;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("Choose operator (+ - * /): ");
        char op= sc.next().charAt(0);
        switch (op) {
        	case '+': System.out.println("Result: " + (a + b)); break;
        	case '-': System.out.println("Result: " + (a - b)); break;
        	case '*': System.out.println("Result: " + (a * b)); break;
        	case '/': System.out.println("Result: " + (b != 0 ? (a / b) : "Cannot divide by zero")); break;
        	default: System.out.println("Invalid operator");
        }
        sc.close();
	}
}
