package Topic5CopyConstructorOrConstructorOverloading;

public class ex2Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        ex2 car1 = new ex2();
        car1.display(); //method call

        ex2 car2 = new ex2("i20", 2021);
        car2.display();
    }
}
