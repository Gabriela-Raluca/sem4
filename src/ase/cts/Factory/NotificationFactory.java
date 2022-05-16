package ase.cts.Factory;

public class NotificationFactory {
    public static Notification createStaticNotification(String type) throws Exception {
        if(type==null)
            return null;
        switch (type) {
            case "SMS":
                return new SMS();

            case "EMAIL":
                return new Email();

            case "PUSH":
                return new Push();
            default:
                throw new IllegalArgumentException("Tipul  "+type+ " nu este cunoscut");
        }
}}
