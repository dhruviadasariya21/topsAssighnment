package mypkgfirst;

import java.util.Scanner;

class StudentBasic{
	String name,gender;
	int age;
	
	void getBasicInfo() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Name");
		 name = scan.next();
		 
		 System.out.println("Enter Gender");
		 gender = scan.next();
		 
		 System.out.println("Enter Contac Number");
		 age = scan.nextInt();
		
	}
    void displayBasicInfo() {
    	 System.out.println(name+"\t"+gender+"\t"+age);  

	}
	
	
}

class StudentResult extends StudentBasic {
	
	int total;
	float percentage;
	String grade;
	
	void getResultInfo() {
		
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter Total");
		 total = scan.nextInt();
		 
		 System.out.println("Enter percentage");
		 percentage = scan.nextFloat();
		 
		 System.out.println("Enter grade");
		 grade = scan.next();
		 
	}
	
	void displayResultInfo() {
		System.out.println(total+"\t"+percentage+"\t"+grade);
	}
	
	
}

public class ex_enheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentResult sr=new StudentResult();
		sr.getBasicInfo();
		sr.getResultInfo();
		sr.displayBasicInfo();
		sr.displayResultInfo();
		
	}


}


