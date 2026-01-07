package mypkgfirst;
import java.util.Scanner;

public class totalevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int evencount = 0;
		int oddcount = 0;
		
		while(num != 0) {
			int digit = num % 10;
			
			if(digit % 2 == 0) {
				evencount++;
			}else {
				oddcount++;
			}
			num = num / 10;			
		}
		System.out.println("Total even digits : " + evencount);
		System.out.println("Total odd digits : " + oddcount);
	}

}
