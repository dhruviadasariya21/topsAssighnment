package mypkgfirst;

abstract class Account
{  

    abstract double calculateInterest(int amount);
}

class SavingAccount extends Account
{
    public double calculateInterest(int amount)
    
 }

class CurrentAccount extends Account
{
    public double calculateInterest(int amount)
    {
        return amount*2
    }
}


public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account acc[] = new Account[10];

	     
	        acc[0] = new SavingAccount();
	        acc[1] = new CurrentAccount();

	        
	        for(int i = 0; i < acc.length; i++)
	        {
	            System.out.println("Interest = " + acc[i].calculateInterest());
	        }
	    }
	}


