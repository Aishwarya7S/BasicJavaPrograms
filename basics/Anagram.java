package basicJavaPrograms;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "listen", b = "silent";
        char[] ca = a.toCharArray(), cb = b.toCharArray();
        Arrays.sort(ca); Arrays.sort(cb);
        System.out.println(Arrays.equals(ca, cb) ? "Anagram" : "Not Anagram");

	}

}
