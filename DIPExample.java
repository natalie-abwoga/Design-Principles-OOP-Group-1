// Abstraction - high-level and low-level modules depend on this interface
interface MessageService {
    void send(String message);
}

// Low-level module 1
class EmailService implements MessageService {
    public void send(String message) {
        System.out.println("📧 Email sent: " + message);
    }
}

// Low-level module 2
class SMSService implements MessageService {
    public void send(String message) {
        System.out.println("📱 SMS sent: " + message);
    }
}

// High-level module
class NotificationManager {
    private MessageService messageService;

    // Constructor Injection of abstraction
    public NotificationManager(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.send(message);
    }
}

// Main class to test DIP
public class DIPExample {
    public static void main(String[] args) {
        // Using EmailService
        MessageService emailService = new EmailService();
        NotificationManager emailNotifier = new NotificationManager(emailService);
        emailNotifier.notifyUser("Welcome via Email!");

        // Using SMSService
        MessageService smsService = new SMSService();
        NotificationManager smsNotifier = new NotificationManager(smsService);
        smsNotifier.notifyUser("Welcome via SMS!");
    }
}
