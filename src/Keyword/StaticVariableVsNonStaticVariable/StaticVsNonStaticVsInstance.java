package Keyword.StaticVariableVsNonStaticVariable;

public class StaticVsNonStaticVsInstance {
    int x=5;    // instance variable: any one can use using reference variable while creating a object.
    static int s=64;// static variable : can use only with static method or constructor.
    //default constructor: means no parameter and no return value and no this keyword
    StaticVsNonStaticVsInstance() {
        int l =10;  //local variable: can use only particular method or constructor.
        System.out.println("this is a default constructor also.");
        System.out.println(l);
    }

    public static void main(String[] args) {
        StaticVsNonStaticVsInstance iv = new StaticVsNonStaticVsInstance();
        System.out.println("this is a instance variable: " + iv.x);
        System.out.println("static variable: " + s);
    }
}
