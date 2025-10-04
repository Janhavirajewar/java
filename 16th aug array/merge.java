import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] brr = new int[n];
        int[] crr = new int[n];

        // Input for first array
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input for second array
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            brr[i] = sc.nextInt();
        }

        // Add arrays element by element
        for (int i = 0; i < n; i++) {
            crr[i] = arr[i] + brr[i];
        }

        // Print result
        System.out.println("Resultant array (sum):");
        for (int i = 0; i < n; i++) {
            System.out.print(crr[i] + " ");
        }
    }
}
