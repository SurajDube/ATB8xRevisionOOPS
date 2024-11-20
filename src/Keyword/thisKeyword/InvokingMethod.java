package Keyword.thisKeyword;

public class InvokingMethod {

    void display() {
        System.out.println("Hello, World!");
    }

    void invokeDisplay() {
        this.display();
    }

    public static void main(String[] args) {
        InvokingMethod obj = new InvokingMethod();
        obj.invokeDisplay();
    }
}

