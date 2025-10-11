import java.util.*;

public class linklist {

	public static void main1(String[] args) {
        // Create an ArrayList of Integers
        LinkedList al = new LinkedList();

        // Add elements
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(6);

        // Display result
        System.out.println("Result: " + al);
        System.out.println("Element at index 0: " + al.get(0));
    }
	
	public static void main(String[] args) {
        // Create an ArrayList of Integers
       TreeSet al = new TreeSet();

        // Add elements
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(6);
        al.add(6);

        // Display result
        System.out.println("Result: " + al);
        System.out.println("First element: " + al.first());
        System.out.println("Last element: " + al.last());
    }
	
}
