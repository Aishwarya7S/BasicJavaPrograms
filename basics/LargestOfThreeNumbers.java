package basicJavaPrograms;
import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number:");
		int num3 = sc.nextInt();
		
		int largestnum;		
		if(num1 > num2 && num1 > num3) {
			largestnum = num1;
		}
		else if (num2 > num1 && num2 > num3) {
			largestnum = num2;
		}
		else {
			largestnum = num3;
		}
		System.out.println("The largest number is : " + largestnum);
		sc.close();
	}

}

//  Another way -> 
// largest = Math.max(Math.max(num1, num2), num3);
// largest = z > (x>y ? x:y) ? z:((x>y) ? x:y); 