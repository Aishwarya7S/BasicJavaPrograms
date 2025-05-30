package patternPrograms;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		for(int a = num; a >= 1; --a) {
			for(int b = 1; b <= a; ++b) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}

//OUTPUT - Reverse Half Pyramid Using Numbers
//1 2 3 4 5 6 7 
//1 2 3 4 5 6 
//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 
