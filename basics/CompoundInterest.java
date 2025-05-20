package basicJavaPrograms;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 10000, rate = 10.25, time = 5;
		double ci = principal * (Math.pow((1 + rate / 100), time));   
		System.out.println("Compound Interest is "+ ci);
	}

}
