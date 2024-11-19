package Topic6TypeOfMethod;

public class Lab125_nonStaticMethod {
    // Instance method
    void disp() {
        // Local variable
        int a = 20;
        System.out.println(a);
    }
    public static void main(String[] args) {

        // Creating object of the class
        Lab125_nonStaticMethod obj = new Lab125_nonStaticMethod();

        // Calling instance method
        obj.disp();

        System.out.println("Hello");
    }
}