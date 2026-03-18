package org.example;

public class NotificationConfig {
    private static NotificationConfig instance;
    private String name="He thong thong bao khach hang";
    private NotificationConfig(){
        System.out.println("Dang tai cau hinh ung dung....");
    }
    public static NotificationConfig getInstance(){
        if(instance==null) {
            instance = new NotificationConfig();
        }
        return instance;
    }

    public void showName() {
        System.out.println("Ten he thong: "+name);
    }
}
