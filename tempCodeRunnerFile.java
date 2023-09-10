import java.util.Scanner;

public class Unsorted_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int second_max = Integer.MIN_VALUE; // Initialize to a smaller value
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        System.out.println("The largest element is: " + max);
        System.out.println("The second largest element is: " + second_max);
        scanner.close();
    }
}
