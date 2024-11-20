package OOPSConcept.Topic9Encapsulation.ex1;

public class Student {
    //private data member
    private String name;    //always private
    private String age;

    //getters
    public String getName() {
        return name;
    }
    //setters   // we can set the value using constructor also
    public void setName(String name) {
        this.name = name;
    }

}