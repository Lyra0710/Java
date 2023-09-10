//Given an array, find the largest and second largest element in the array without sorting the array. Assume that all the elements are positive int. (Do not use any java Library functions). If there are two numbers equally larger, then print both.
import java.util.Scanner;
public class Unsorted_Array{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int second_max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }
            else if(arr[i] > second_max && arr[i] != max){
                second_max = arr[i];
            }
        }
        System.out.println("The largest element is: " + max);
        System.out.println("The second largest element is: " + second_max);
        scanner.close();
    }
}