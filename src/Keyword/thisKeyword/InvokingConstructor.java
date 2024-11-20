package Keyword.thisKeyword;

public class InvokingConstructor {
        int a;
        int b;

    InvokingConstructor() {
            this(10,50);
        }

    InvokingConstructor(int a, int b) {
            this.a = a;
            this.b = b;
        }

        void display() {
            System.out.println("a: " + a + ", b: " + b);
        }

        public static void main(String[] args) {
            InvokingConstructor obj = new InvokingConstructor();
            obj.display();
        }
    }