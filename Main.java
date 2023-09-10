//Write a program to check whether a given number (n-digit number) is armstrong or not. Print YES if it is an armstrong number and NO if it is not an armstrng number.
// An Armstrong number is an integer such that the sum of its digits raise to the power of n is equal to the number itself.

// For Example: For example for a 3 digit number, 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        int temp = n;
        int sum = 0;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = n;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}