package Topic6TypeOfMethod;

public class Lab123_staticMethod {
    public static void show1() {//static method.
        String st1 = "You are a static method";
        System.out.println("It is an example of static method." + st1);
    }

    public void show2() {   // non static method.
        String st2 = "You are a non static method.";
        System.out.println("It is an example of non static method." + st2);
    }

    public static void main(String[] args) {
        show1();// static method can call directly
        // for accessing non static method we need to create object
        Lab123_staticMethod nm = new Lab123_staticMethod();
        nm.show2();
    }
}
