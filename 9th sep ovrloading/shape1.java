class Shape {

    // Area of Triangle (0.5 * base * height)
    void area(double base, double height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }

    // Area of Rectangle (length * breadth)
    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }

    // Area of Circle (π * r^2)
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();

        System.out.println("Program is running!");

        // Calling overloaded methods
        s1.area(10.0, 5.0);   // Triangle
        s1.area(8, 4);        // Rectangle
        s1.area(7.0);         // Circle
    }
}
