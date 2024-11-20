package Keyword.thisKeyword;

public class ReferencingInstanceVariables {
    int a=15;
    int b=16;

    ReferencingInstanceVariables(int a, int b) {
       // a = a;          b = b;    //15,16
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a: " + this.a + ", b: " + this.b);
    }

    public static void main(String[] args) {
        ReferencingInstanceVariables obj = new ReferencingInstanceVariables(10, 20);
        obj.display();
    }
}