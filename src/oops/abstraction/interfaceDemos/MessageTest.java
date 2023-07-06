package oops.abstraction.interfaceDemos;

public class MessageTest {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();

        messageService.sendMessage("good morning");
        System.out.println(messageService.receiveMessage());

    }
}
