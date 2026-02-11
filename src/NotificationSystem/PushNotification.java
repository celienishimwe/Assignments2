package NotificationSystem;

public class PushNotification implements NotificationService {

    private String deviceId;

    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Notification to device" + " " + deviceId + " " + message);
    }

    @Override
    public void priority(String priority) {
        System.out.println("default Notification: " + priority);
    }
}