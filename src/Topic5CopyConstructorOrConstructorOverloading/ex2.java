package Topic5CopyConstructorOrConstructorOverloading;

public class ex2 {
    String model;
    int year=2012;

    // Default constructor
    ex2() {
        this.year = 2012;
    }
    // Parameterized Constructor
    ex2(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
