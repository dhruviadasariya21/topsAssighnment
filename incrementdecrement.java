package mypkgfirst;

import java.util.Scanner;
public class incrementdecrement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int a = sc.nextInt();
		
		System.out.println("a = " + a);
		System.out.println("a++ = " + (a++));
		System.out.println("Now a = " + a);
		System.out.println("++a = " + (++a));
		System.out.println("a-- = " + (a--));
		System.out.println("Now a = " + a);
		System.out.println("--a = " + (--a));
		// TODO Auto-generated method stub

	}

}
