package oops.inheritance.accessingMembers;

public class Child extends Parent {

    int a = 1000;
    int b = 2000;
    int c = 3000;
    int d = 4000;

    void display(){
        int a = 10000;
        int b = 20000;
        int c = 30000;
        int d = 40000;

        //from parent class
        System.out.println("Parent class instance variables "+super.a);//100
        System.out.println("Parent class instance variables "+super.b);//200
        System.out.println("Parent class instance variables "+super.c);//300
        System.out.println("Parent class instance variables "+super.d);//400

        //from same class
        System.out.println("same class instance variable "+this.a);//1000
        System.out.println("same class instance variable "+this.b);//2000
        System.out.println("same class instance variable "+this.c);//3000
        System.out.println("same class instance variable "+this.d);//4000

        //local variables of display
        System.out.println("local variable "+a);//10000
        System.out.println("local variable "+b);//20000
        System.out.println("local variable "+c);//30000
        System.out.println("local variable "+d);//40000
    }

    public static void main(String[] args) {
        Child  child = new Child();
        child.display();

    }
}
