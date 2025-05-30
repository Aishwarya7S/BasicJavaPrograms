package patternPrograms;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha = 'A', letter = 'G';
		for(int a = 1; a <= ( letter - 'A' + 1); ++a) {
			for(int b = 1; b <= a; ++b) {
				System.out.print(alpha + " ");
			}
			++alpha;
			System.out.println();
		}
	}
}

//OUTPUT - Half Pyramid Using Alphabets
//A 
//B B 
//C C C 
//D D D D 
//E E E E E 
//F F F F F F 
//G G G G G G G 
