package pkgsecond;

public interface notificationservice {
	 void sendMessage(String message);

}

class EmailNotification implements notificationservice {

    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}
class SMSNotification implements notificationservice {

    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}
class PushNotification implements notificationservice {

    public void sendMessage(String message) {
        System.out.println("Push Notification sent: " + message);
    }
}

class NotificationSender {

    public static void send(notificationservice service, String msg) {
        service.sendMessage(msg);
    }



    public static void main(String[] args) {

        notificationservice n;

        n = new EmailNotification();
        NotificationSender.send(n, "Welcome to our App!");

        n = new SMSNotification();
        NotificationSender.send(n, "Your OTP is 1234");

        n = new PushNotification();
        NotificationSender.send(n, "You have a new message");
    }
}



