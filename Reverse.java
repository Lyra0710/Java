//Reverse Array
//Create a class Reverse that consists of one global attribute :
//In main() take an integer as a user input, and assign each of the digit as an element to an int array. (Assume the size of input is less than 10).
//Create a method reverse_array() which reverses the given integer (without using the java library functions) and then returns the reversed value as an array.
//Print the returned value from the function as an int.
import java.util.Scanner;
public class Reverse{
    public static int[] reverse_array(int n){
        int[] arr = new int[10];
        int i = 0;
        while(n > 0){
            arr[i] = n % 10;
            n /= 10;
            i++;
        }
        return arr;
    }
    //In main() take an integer as a user input, and assign each of the digit as an element to an int array. (Assume the size of input is less than 10).
    // dont fill the array with 0's
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        int[] arr = reverse_array(n);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                System.out.print(arr[i]);
            }
        }
        scanner.close();
    }
}