package basicJavaPrograms;

public class Swap {
	static void swapUsingThirdVariable(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Value of a is " + a  + " and Value of b is " + b);
	}
	
	static void swapWithoutThirdVariable(int a, int b) {
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("Value of a is " + a  + " and Value of b is " + b);		
	}
	
	static void swapUsingXOR(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Value of a is " + a  + " and Value of b is " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapUsingThirdVariable(3,7);
		swapWithoutThirdVariable(5,10);
		swapUsingXOR(35,77);
		}

}
