package basicJavaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 137, sum = 0, temp = num;
		while(num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, 3);
			num /= 10;
		}
		if(sum == temp) 
			System.out.println("Armstrong Number");
		else	
			System.out.println("Not Armstrong Number");
	}
}
