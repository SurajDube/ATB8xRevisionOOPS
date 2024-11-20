package OOPSConcept.Topic4ParameterizedConstrutor;

//withParameterNoReturnType
// 1 you need to 3 things, one constructor and this keyword,
// one method for displaying,
// one constructor,
// some variable and method and main class
public class ParameterizedConstrutor {
    int roll;
    String name;

    ParameterizedConstrutor(int roll, String name){
        this.roll=roll;
        this.name=name;
        System.out.println("hello this is withParameterNoReturnType");
    }
    void display() {
        System.out.println("roll: " + roll + ", name: " + name);
    }
    public static void main(String[] args) {
        ParameterizedConstrutor wpm = new ParameterizedConstrutor(5, "Suraj");
        wpm.display();
    }
}
