package OOPSConcept.Topic7Inheritance.Type1SingleInheritance.ex1;

public class Son extends father {
    int sg=1000;

    void bhk3(){
        System.out.println("father: 3BHK");
        System.out.println(fg); //parent class attributes
        bhk1(); //parent class method
    }
    void money(){
        System.out.println("father: 1000M");
        System.out.println(fg); //parent class attributes
        bhk1(); //parent class method
    }

}
