package Topic1ClassObject;

public class typesOfVariable {
    int x=5;    // instance variable: any one can use using reference variable while creating a object.
    static int s=64;// static variable : can use only with static method or constructor.
    //default constructor: means no parameter and no return value and no this keyword
    typesOfVariable() {
        int l =10;  //local variable: can use only particular method or constructor.
        System.out.println("this is a default constructor.");
        System.out.println(l);
    }

    public static void main(String[] args) {
        typesOfVariable dc = new typesOfVariable();
        System.out.println("this is a dc" + dc.x);
        System.out.println("static variable: " + s);
    }
}
