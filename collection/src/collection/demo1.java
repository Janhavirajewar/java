package collection;
import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList al = new ArrayList();

        // Add elements
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(6);
        al.add(6);
        al.add(2);

        // Display result
        System.out.println("Result: " + al);
        System.out.println("Element at index 0: " + al.get(7));
    }
}
