package basicJavaPrograms;
import java.util.Scanner;

public class MathFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (base): ");
        double base = sc.nextDouble();

        System.out.print("Enter an exponent: ");
        double exponent = sc.nextDouble();

        System.out.print("Enter another number: ");
        double num = sc.nextDouble();

        System.out.println("\nMath Function Results:");

        // Power - the value of the first argument raised to the power of the second argument.
        System.out.println(base + " raised to the power " + exponent + " = " + Math.pow(base, exponent));

        // Square root - square root of a given number.
        System.out.println("Square root of " + num + " = " + Math.sqrt(num));

        // Absolute value - absolute value (non-negative) of the given number, regardless of sign
        System.out.println("Absolute value of " + (num - base) + " = " + Math.abs(num - base));

        // Ceiling - rounding up value
        System.out.println("Ceiling of " + num + " = " + Math.ceil(num));

        // Floor - rounding down value
        System.out.println("Floor of " + num + " = " + Math.floor(num));

        // Round - rounding half up
        System.out.println("Round of " + num + " = " + Math.round(num));

        // Max and Min - the maximum or minimum of two values
        System.out.println("Max of " + base + " and " + num + " = " + Math.max(base, num));
        System.out.println("Min of " + base + " and " + num + " = " + Math.min(base, num));

        // Random - generating random numbers
        System.out.println("Random number between 0.0 and 1.0 = " + Math.random());

        sc.close();
	}
}
