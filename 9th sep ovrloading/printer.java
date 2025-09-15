class Printer {
    void print(char c) {
        System.out.println("char is " + c);
    }

    void print(int c) {
        System.out.println("int is " + c);
    }

    void print(String c) {
        System.out.println("String is " + c);
    }
}

class TestPrinter {
    public static void main(String[] args) {
        Printer p1 = new Printer();  // object created
        p1.print('A');               // char call
        p1.print(10);                // int call
        p1.print("Firstbit");        // string call
    }
}
