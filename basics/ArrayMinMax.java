package basicJavaPrograms;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {20,3,32,77,15,44,60};
		int max = num[0], min = num[0];
		for(int i : num) {
			if(i > max)
				max = i;
			if(i < min )
				min = i;
		}
        System.out.println("Max Element : " + max + "\t  Min Element : " + min);
	}
}
