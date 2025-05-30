package patternPrograms;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for(int i = 1; i <= num; i++) {
			for(int j = i; j < num; j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
		}
	}
}

//OUTPUT - Full Pyramid Using Star