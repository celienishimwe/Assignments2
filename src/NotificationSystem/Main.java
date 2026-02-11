package NotificationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("\n enter device number  id:");
        String deviceId = user_input.nextLine();

        System.out.print("\n enter default priority message:");
        String message_priority = user_input.nextLine();

        System.out.print("\n enter message to send:");
        String message = user_input.nextLine();


        NotificationService nt = new PushNotification(deviceId);
        nt.sendNotification("new message sent");
        nt.priority(message_priority);
    }

}

