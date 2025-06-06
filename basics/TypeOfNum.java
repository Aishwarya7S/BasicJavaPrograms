package basicJavaPrograms;
import java.util.Scanner;

public class TypeOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(num > 0)
			System.out.print("Positive number");
		else if(num < 0)
			System.out.print("Negative number");
		else
			System.out.print("Zero");
	}
}
