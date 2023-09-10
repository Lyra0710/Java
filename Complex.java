import java.util.Scanner;

public class Complex{
    private int real;
    private int imaginary;
    public Complex() {
        real = 0;
        imaginary = 0;
    }
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void add(Complex c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }
    public void subtract(Complex c) {
        this.real -= c.real;
        this.imaginary -= c.imaginary;
    }
    public void multiply(Complex c) {
        int real = this.real * c.real - this.imaginary * c.imaginary;
        int imaginary = this.real * c.imaginary + this.imaginary * c.real;
        this.real = real;
        this.imaginary = imaginary;
    }
    public void print() {
        // add conditions for + and - accordingly for negative complex numbers
        if (this.imaginary < 0) {
            System.out.println(this.real + " - " + Math.abs(this.imaginary) + "i");
        } else {
            System.out.println(this.real + " + " + this.imaginary + "i");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real and imaginary part of first complex number: ");
        int real1 = scanner.nextInt();
        int imaginary1 = scanner.nextInt();
        System.out.println("Enter real and imaginary part of second complex number: ");
        int real2 = scanner.nextInt();
        int imaginary2 = scanner.nextInt();
        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);
        System.out.println("Enter 1 for multiplication, 2 for addition, 3 for subtraction: ");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                c1.multiply(c2);
                break;
            case 2:
                c1.add(c2);
                break;
            case 3:
                c1.subtract(c2);
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Result: ");
        c1.print();
        scanner.close();
    }
} 
