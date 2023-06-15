package classComponents;

import sun.security.jca.GetInstance;

public class InstanceVariables {
    //outside of all methods, constructors, blocks
    int a = 100;//instance variables
    int b = 200;//instance variable

    static int c = 300;//static variable
    static int d = 400;//static variable

    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;
        int c = 3000;
        int d = 4000;
        System.out.println(a);//1000
        System.out.println(b);//2000
        System.out.println(c);//3000
        System.out.println(d);//4000

        InstanceVariables ref = new InstanceVariables();
        System.out.println(ref.a);//instance variable value 100
        System.out.println(ref.b);//200

        //static variables
        System.out.println(InstanceVariables.c);//300
        System.out.println(InstanceVariables.d);//400

    }

}
