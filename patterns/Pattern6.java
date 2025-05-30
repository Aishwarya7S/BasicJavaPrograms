package patternPrograms;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for(int i = 1; i <= num; i++) {
			for(int j = i; j < num; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
	            System.out.print(k + " ");
	         }

            for (int l = i - 1; l >= 1; l--) {
	             System.out.print(l + " ");
	        }
            System.out.println();
		}
	}
}

//OUTPUT - Full Pyramid Using Number