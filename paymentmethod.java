package pkgsecond;

public interface paymentmethod {
	   void pay(double amount);	
	
}
	
class CreditCardPayment implements paymentmethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UPIPayment implements paymentmethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CashPayment implements paymentmethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " in Cash");
    }


    public static void main(String[] args) {

        paymentmethod p;

        p = new CreditCardPayment();
        p.pay(1500);

        p = new UPIPayment();
        p.pay(800);

        p = new CashPayment();
        p.pay(300);
    }
}