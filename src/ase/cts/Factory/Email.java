package ase.cts.Factory;

public class Email implements Notification{

        @Override
        public void notifyUser() {
            System.out.println("Ati primit un email!");
        }
    }

