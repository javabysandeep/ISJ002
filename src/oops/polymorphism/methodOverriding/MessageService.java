package oops.polymorphism.methodOverriding;

public class MessageService {
    //private, static, final methods cant be overriden
    //we cannot override constructor
    // we cant override main method also
     void sendMessage(String message){
        System.out.println("sending message with Email");
    }
}
