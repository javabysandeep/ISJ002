package oops.abstraction.interfaceDemos;

public class Facebook implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("sending facebbok");
    }

    @Override
    public String receiveMessage() {
        return "facebook";
    }
}
