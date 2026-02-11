package NotificationSystem;

public interface NotificationService {

    void sendNotification(String message);

    default void priority(String priority) {
        System.out.println("This is a default Priority");
    }
}
