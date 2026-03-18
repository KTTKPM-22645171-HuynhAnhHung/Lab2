package org.example;

public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Gui push tren app: "+message);
    }
}
