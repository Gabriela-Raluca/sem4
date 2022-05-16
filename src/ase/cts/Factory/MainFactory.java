package ase.cts.Factory;

public class MainFactory {
    public static void main(String[] args) {
        Notification notificare1= null;
        try {
            notificare1 = NotificationFactory.createStaticNotification("SMS");
        } catch (Exception e) {
            e.printStackTrace();
        }
        notificare1.notifyUser();
    }
}
