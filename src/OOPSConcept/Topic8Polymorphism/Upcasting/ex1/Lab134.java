package OOPSConcept.Topic8Polymorphism.Upcasting.ex1;

public class Lab134 {
    public static void main(String[] args) {
        //Upcasting
        Sport sport1 = new Cricket();
        //calling method
        sport1.displayName();

        //Upcasting
        Sport sport2 = new Football();
        //calling method
        sport2.displayName();
    }
}
