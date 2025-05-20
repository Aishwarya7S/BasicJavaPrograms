package basicJavaPrograms;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15 , b = 50;
		int res = ( a > b ) ? a : b ;
		while (true) {
			if(res % a == 0 && res % b == 0) 
				break;
		res++;
		}
		System.out.println("LCM of " + a + " and " + b  + " : " + res);
	}
}
