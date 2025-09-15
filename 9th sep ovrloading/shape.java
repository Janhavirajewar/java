class Shape {
    void calculateTriangle(Triangle t1) {
        double area = 0.5 * t1.getBase() * t1.getHeight();
        System.out.println("Area of Triangle = " + area);
    }

    void calculateRectangle(Rectangle r1) {
        int area = r1.getLength() * r1.getBreadth();
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle {
    int base;
    int height;

    Triangle() {
        this.base = 0;
        this.height = 0;
    }

    Triangle(int a, int b) {
        this.base = a;
        this.height = b;
    }

    void setBase(int b) {
        this.base = b;
    }

    void setHeight(int h) {
        this.height = h;
    }

    int getBase() {
        return this.base;
    }

    int getHeight() {
        return this.height;
    }

    void display() {
        System.out.println("Base = " + this.base);
        System.out.println("Height = " + this.height);
    }
}

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(int a, int b) {
        this.length = a;
        this.breadth = b;
    }

    void setLength(int l) {
        this.length = l;
    }

    void setBreadth(int b) {
        this.breadth = b;
    }

    int getLength() {
        return this.length;
    }

    int getBreadth() {
        return this.breadth;
    }

    void display() {
        System.out.println("Length = " + this.length);
        System.out.println("Breadth = " + this.breadth);
    }
}

class Test {
    public static void main(String[] args) {
        Shape s1 = new Shape();

        Triangle t1 = new Triangle(10, 20);
        t1.display();
        s1.calculateTriangle(t1);

        Rectangle r1 = new Rectangle(5, 8);
        r1.display();
        s1.calculateRectangle(r1);
    }
}
