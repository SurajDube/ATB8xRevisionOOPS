package OOPSConcept.Topic5CopyConstructorOrConstructorOverloading;

public class ex1Main {
    public static void main(String[] args) {
        // This would invoke the parameterized constructor.
        System.out.println("First Object");
        ex1 o1 = new ex1("Avinash", 68);
        System.out.println("ObjectName :" + o1.name + " and ObjectId :" + o1.id);

        System.out.println();

        // This would invoke the copy constructor.
        ex1 o2 = new ex1(o1);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("ObjectName :" + o2.name + " and ObjectId :" + o2.id);
    }
}
