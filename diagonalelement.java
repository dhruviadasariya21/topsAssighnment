package mypkgfirst;

import java.util.Scanner;

public class diagonalelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int sum = 0;
		int number=0;
		
		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				if(i==j) {
					sum = sum + [i][j];
				}
			}
		}
		System.out.println("sum of diagonal elements = " + sum);
      
	}

}
