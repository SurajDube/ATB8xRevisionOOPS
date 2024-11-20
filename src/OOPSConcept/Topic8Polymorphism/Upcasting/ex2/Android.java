package OOPSConcept.Topic8Polymorphism.Upcasting.ex2;
//Creating a child class for parent 'MobileOS'
public class Android extends MobileOS{
    //overriding display method
    void display()
    {
        System.out.println("Android is a MobileOS.");
    }
}
