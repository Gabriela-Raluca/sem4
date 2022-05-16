package ase.cts.Factory;

public class SMS implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Ati primit un SMS!");
    }
}
