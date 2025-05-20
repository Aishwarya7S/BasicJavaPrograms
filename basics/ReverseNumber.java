package basicJavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234567;
		int reverse = 0;
		
		while(number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;			
		}
		System.out.println("Reverse number is " + reverse);
	}

}
