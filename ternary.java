package mypkgfirst;

import java.util.Scanner;

public class ternary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		String msg = (name.equals("Dhruvi")) ? "Correct Name" : "wrong Name";
		
		System.out.println(msg);
				
		// TODO Auto-generated method stub

	}

}
