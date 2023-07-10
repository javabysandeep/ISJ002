package anonymousClass;

public class TestMessage {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();

        MessageService messageService1 = new MessageService() {
            @Override
            public void sendMessage() {
                System.out.println("Sending message using anonymous class method");
            }
        };
        messageService1.sendMessage();
    }
}
