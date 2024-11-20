package Keyword.voidKeyoword;

public class withVoid {
    int u=10;
    static int v=12;
    static void withvoidMethod() {// void method with static
        System.out.println("This is without Static Keyword.");
        System.out.println("static variable: " + v);
    }

    void myMethod() {// void method without static
        System.out.println("This is without Static Keyword.");
        System.out.println("non static static variable: " + u);
    }

    public static void main(String[] args) {
        withVoid v = new withVoid();
        v.myMethod();

        withvoidMethod();
        System.out.println(v);
    }
}
