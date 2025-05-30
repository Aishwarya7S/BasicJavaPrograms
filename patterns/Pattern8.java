package patternPrograms;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, num = 1;
        for(int i=1;i<=n;i++){
        	for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
	}
}

//OUTPUT - Floyd's Triangle
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 