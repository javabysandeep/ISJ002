package collectionFramework.listImplementations.stackDemo;

import java.util.Stack;

public class Demo2Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("size of stack "+stack.size());
        System.out.println("who is there on top of stack "+stack.peek());//10
    }
}
