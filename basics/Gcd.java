package basicJavaPrograms;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 81, b = 153;
		while(a != b) {
			if(a > b) 
				a -= b;
			else
				b -= a;
		}
		System.out.println("GCD  of two number is : " + a);
	}

}

//Another way ->while (b != 0) {
//int temp = b;
//b = a % b;
//a = temp;
//}