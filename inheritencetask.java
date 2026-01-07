package mypkgfirst;

import java.util.Scanner;

class BasicInfo {
	String name,gender;
	int id;
	
	void getBasicInfo() {
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter Id");
		 id = scan.nextInt();
		 System.out.println("Enter Name");
		 name = scan.next();
		 System.out.println("Enter Gender");
		 gender = scan.next(); 
	}
	
	void displayBasicInfo() {
   	 System.out.println(id+"\t"+name+"\t"+gender);  

	}
}

class DeptInfo extends BasicInfo{
	String Dept_name, assign_work;
	int timetocomplete;
	void getDeptInfo() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Department Name");
		 Dept_name = scan.next();
		 System.out.println("Enter Assigned work");
		 assign_work = scan.next(); 
		 System.out.println("Enter time to Complete");
		 timetocomplete = scan.nextInt();
	}
	
	void DisplayDeptInfo() {
		System.out.println(Dept_name+"\t"+assign_work+"\t"+timetocomplete);
	}
	
}
class LoanInfo extends BasicInfo {
	String loan_Details;
	int loan_amount;
	void getLoanInfo() {
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Loan Details");
		 loan_Details = scan.next(); 
		 System.out.println("Enter Loan amount");
		 loan_amount = scan.nextInt();
	}
	void displayLoanInfo() {
		System.out.println(loan_Details+"\t"+ loan_amount );
	}
	
}

public class inheritencetask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    DeptInfo Di=new DeptInfo();
		Di.getBasicInfo();
		Di.getDeptInfo();
		Di.DisplayDeptInfo();
		
		LoanInfo Li= new LoanInfo();
		Li.getBasicInfo();
		Li.getLoanInfo();
		Li.displayLoanInfo();
	}


}


