package basicJavaPrograms;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 17;
	    boolean isPrime = true;

	     if (num <= 1) {
	         isPrime = false;
	     } else {
	          for (int i = 2; i <= num / 2; i++) {
	              if (num % i == 0) {
	                  isPrime = false;
	                  break;
	               }
	          }
	      }

	     System.out.println(num + (isPrime ? " is a Prime Number" : " is not a Prime Number"));
	    }
	}


