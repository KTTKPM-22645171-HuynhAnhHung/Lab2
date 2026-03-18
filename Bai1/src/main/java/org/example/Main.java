package org.example;

public class Main {
    public static void main(String[] args) {
        // Singleton: Lay cau hinh ung dung
        NotificationConfig config = NotificationConfig.getInstance();
        config.showName();

        System.out.println("----- Vi du gui thong bao -----");

        // Factory - tao thong bao email
        Notification notif1 = NotificationFactory.createNotification("email");
        notif1.send("Chao mung ban da dang ky tai khoan");

        // Factory - tao thong bao sms
        Notification notif2 = NotificationFactory.createNotification("sms");
        notif2.send("Ma OTP cua ban la 123456789");

        // Factory - tao thong bao push
        Notification notif3 = NotificationFactory.createNotification("push");
        notif3.send("Ban co 99+ tin nhan chua doc");
    }
}