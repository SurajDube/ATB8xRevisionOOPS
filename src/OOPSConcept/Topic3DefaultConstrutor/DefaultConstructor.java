package OOPSConcept.Topic3DefaultConstrutor;

public class DefaultConstructor {
    int x=5;    // instance variable: any one can use using reference variable while creating a object.
    static int s=64;// static variable : can use only with static method or constructor.
    DefaultConstructor() {// means no parameter and no return value and no this keyword
        int l =10;  //local variable: can use only particular method or constructor.
        System.out.println("this is a default constructor.");
        System.out.println(l);
    }

    public static void main(String[] args) {
        DefaultConstructor dc = new DefaultConstructor();
        System.out.println("this is a dc" + dc.x);
        System.out.println("static variable: " + s);
    }
}
