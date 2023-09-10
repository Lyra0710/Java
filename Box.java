import java.util.Scanner;

public class Box {
    private int height;
    private int width;
    private int breadth;
    public Box() {
        height = 0;
        width = 0;
        breadth = 0;
    }
    public Box(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public Box(int height) {
        this(); 
        this.height = height;
    }

    public int getVolume() {
        return height * width * breadth;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter R for Cuboid and C for Cube: ");        
        char shape = scanner.next().charAt(0);

        int height, width = 0, breadth = 0;

        if (shape == 'R') {
            System.out.println("Enter height, width, and breadth for Cuboid: ");
            height = scanner.nextInt();
            width = scanner.nextInt();
            breadth = scanner.nextInt();
        } else if (shape == 'C') {
            System.out.println("Enter height for Cube: ");
            height = scanner.nextInt();
        } else {
            height = 0;
        }

        Box box;
        if (shape == 'C') {
            box = new Box(height); 
        } else {
            box = new Box(height, width, breadth); 
        }
        int volume = box.getVolume();
        System.out.println("Volume of the Box: " + volume);

        scanner.close();
    }
}
