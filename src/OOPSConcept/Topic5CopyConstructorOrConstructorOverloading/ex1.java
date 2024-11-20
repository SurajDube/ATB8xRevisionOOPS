package OOPSConcept.Topic5CopyConstructorOrConstructorOverloading;

public class ex1 {
    // data members of the class.
    String name;
    int id;

    // Parameterized Constructor
    ex1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    ex1(ex1 obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}


