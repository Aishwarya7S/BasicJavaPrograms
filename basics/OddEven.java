package basicJavaPrograms;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 37 ;
		
		if((n | 1) == n) {
			System.out.println("Odd Number");
		} else {
			System.out.println("Even Number");
		}
	}
}

// Bitwise OR  - if ((n | 1) == n)
// Bitwise AND -  if ((n & 1) == 1)
