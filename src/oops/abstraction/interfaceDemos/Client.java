package oops.abstraction.interfaceDemos;

public class Client {
    public static void main(String[] args) {
       test(new Text());
       test(new WhatsApp());
       test(new Facebook());
    }
   static void test(MessageService messageService){
        messageService.sendMessage("hi");
    }
}
