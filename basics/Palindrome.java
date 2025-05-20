package basicJavaPrograms;

public class Palindrome {
	static void numPalindrome(int num) {
		int rev = 0, original = num;
		while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
		System.out.println(original == rev ? "Palindrome" : "Not Palindrome");      
	}
	static void strPalindrome(String str) {
		String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(str.equals(reverse) ? "Palindrome" : "Not Palindrome");
	}
	public static void main(String[] args) {
		numPalindrome(123);
		strPalindrome("javavaj");
	}
}