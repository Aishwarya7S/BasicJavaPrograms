package basicJavaPrograms;
import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the original amount: ");
		int amount = sc.nextInt();
		System.out.print("Enter discount percentage: ");
		double discount = sc.nextDouble();
		
		double discountprice = (discount / 100) * amount;
		double finalprice = amount - discountprice;
		
		System.out.println("Discount Amount: ₹" + discountprice);
        System.out.println("Final Price after Discount: ₹" + finalprice);
        }
}

// int amount = 1000
// double discount = amount * 0.10; - 10% discount
// double finalPrice = amount - discount;