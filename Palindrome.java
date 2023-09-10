// The program that takes a non-negative integer as input and checks whether the given number is palindrome. 
// It will peint YES if the given number is palindrome, and print NO in all other cases. 

import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        int temp = n;
        int reverse = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        if (reverse == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}