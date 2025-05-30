package basicJavaPrograms;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] numarr = {100,3,37,1,7,15};
		Arrays.sort(numarr);
		System.out.println("Sorted Array : " + Arrays.toString(numarr));
	}

}
