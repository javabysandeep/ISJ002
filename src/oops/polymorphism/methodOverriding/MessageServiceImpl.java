package oops.polymorphism.methodOverriding;

public class MessageServiceImpl extends MessageService{
    @Override

   public void sendMessage(String message) {
        System.out.println("sending the message using whatsApp ");
    }

    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("hello");
    }
}
