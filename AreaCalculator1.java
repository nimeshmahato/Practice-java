//import Scanner to read user input
import java.util.Scanner;
public class AreaCalculator {
    private static float pi = 3.142f;

private static float circle(float radius) {
    return (pi * radius * radius);
}
private static float sphere(float radius) {
    return (pi * radius * radius * radius * 4/3);
}
private static float square(float length) {
    return length * length;
}
private static float cube(float length) {
    return length * length *length;
}

private static float rectangle(float length, float breadth) {
    return length * breadth;
}
private static float cuboid(float length, float breadth,float height) {
    return length * breadth * height;
}

    //Add the methods to calculate area here

    public static void main(String s[]){
        System.out.println("Welcome to the area calculator!");
        while(true) {
                     System.out.println("\nEnter 1 for circle\n" +
                              "Enter 2 for square\n" +
                              "Enter 3 for rectangle\n" +
                              "Enter 4 for sphere volume\n" +
                              "Enter 5 for cube volume\n" +
                              "Enter 6 for cuboid volume");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Enter the radius of the circle");
                float radius = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of circle of radius "+ radius + "is " + circle(radius));
            } else if (choice == 2) {
                System.out.println("Enter the length of the square");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of square of side length "+ length + " is " + square(length));
            } else if (choice == 3) {
                System.out.println("Enter the length of the rectangle");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the rectangle");
                float breadth = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of rectangle of length "+ length +
                                    "and breadth "+breadth+ " is " + rectangle(length,breadth));
            }else if (choice == 4) {
                System.out.println("Enter the radius of the Sphere");
                float radius = Float.parseFloat(scanner.nextLine());
                System.out.println("The volume of sphere of radius "+ radius + "is " + sphere(radius));
            }else if (choice == 5) {
                System.out.println("Enter the length of the cube");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("The volume of cube of length "+ length + "is " + cube(length));
            }else if (choice == 6) {
                System.out.println("Enter the length of the cuboid");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the cuboid");
                float breadth = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the height of the cuboid");
                float height = Float.parseFloat(scanner.nextLine());
                System.out.println("The volume of cuboid of length "+ length +
                                    "and breadth "+breadth+ "and height" +height+ "is " + cuboid(length,breadth,height));

            }
            else {

                System.out.println("Invalid choice");
                break;
            }   //Add the menu to get user input and invoke method here
        }
    }
}
