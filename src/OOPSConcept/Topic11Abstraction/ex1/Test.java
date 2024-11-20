package OOPSConcept.Topic11Abstraction.ex1;

public class Test {

    //Creating a Test class which calls abstract and non-abstract methods
    public static void main(String[] args){
        Bike obj1 = new Honda();
        obj1.run();
        obj1.changeGear();  // don't know from which class it is coming.

        Bike obj2 = new Hero();
        obj2.run();
        obj2.changeGear();// don't know from which class it is coming.
    }
}
