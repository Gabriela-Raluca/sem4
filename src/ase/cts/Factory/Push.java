package ase.cts.Factory;

public class Push implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Ati fost notificat prin push!");
    }
}
