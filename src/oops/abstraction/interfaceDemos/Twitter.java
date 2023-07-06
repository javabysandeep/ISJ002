package oops.abstraction.interfaceDemos;

public class Twitter implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("sending twitter");
    }

    @Override
    public String receiveMessage() {
        return "twitter";
    }
}
