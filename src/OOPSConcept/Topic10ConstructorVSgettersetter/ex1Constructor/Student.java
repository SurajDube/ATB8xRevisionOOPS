package OOPSConcept.Topic10ConstructorVSgettersetter.ex1Constructor;

public class Student {
    private String name;
    private int age;


    public Student(){
        this.name = "Rama";
        this.age = 29;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display() {// you can print in main method also
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
    }
}

