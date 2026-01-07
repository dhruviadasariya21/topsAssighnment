package mypkgfirst;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 int rev = 0;
		 System.out.println("Enter number");
		 int num = sc.nextInt();
		 
		 while(num != 0) {
			 int digit = num % 10;
			 rev = rev * 10 + digit;
			 num = num / 10;
		 }
		 System.out.println("Reverse number is: " + rev);
		 
		 
		 

	}

}
