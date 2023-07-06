package oops.abstraction.interfaceDemos;

public class WhatsApp implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("sending whatsApp");
    }

    @Override
    public String receiveMessage() {
        return "whatsApp";
    }
}
