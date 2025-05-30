package patternPrograms;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for(int i = num ; i >= 1; --i) {
			for(int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//OUTPUT -  Reverse Half Pyramid Using Star
//*****
//****
//***
//**
//*
