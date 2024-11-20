package OOPSConcept.Topic12Interface.ex1;

public class TestInterface {
    public static void main(String[] args) {
        Lion myLion = new Lion();   // object for child class
        myLion.animalSound();
        myLion.sleep();
    }
}
