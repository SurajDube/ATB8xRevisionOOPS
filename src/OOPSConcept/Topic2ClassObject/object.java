package OOPSConcept.Topic2ClassObject;

public class object {
    int x = 5;
    public static void m1(){   // static method can call directly
        System.out.println("this is a static method.");
    }
    public void m2(){
        System.out.println("this is a non static method.");
    }
    public static void main(String[] args) {
        m1();
        // how to call non static method
        // using creating object
        object o = new object();
        o.m2();
    }
}
