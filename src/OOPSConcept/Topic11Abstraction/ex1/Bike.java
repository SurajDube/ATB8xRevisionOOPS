package OOPSConcept.Topic11Abstraction.ex1;

abstract public class Bike {
    Bike()  // non abstract methods
    {
        System.out.println("bike is created");
    }
    abstract void run();    // abstract methods
    void changeGear() {
        System.out.println("gear changed");
    }
}
