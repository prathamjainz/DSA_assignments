package Assignments;

import java.util.*;

import static java.lang.Math.sqrt;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\n--------------------------------------------------\nMAIN LIST (choose option) :\n1.Circle \t2.Rectangle \t3.Square \t4.Triangle\t5.EXIT");
            int option = sc.nextInt();
            System.out.println("Select action:\n1.Area \t2.Perimeter  ");
            int action = sc.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Enter Radius of circle in cm ");
                    double r = sc.nextDouble();
                    switch (action) {
                        case 1 -> System.out.println("Area of Circle = " + Math.PI * r * r);
                        case 2 -> System.out.println("Perimeter of Circle = " + 2 * Math.PI * r);
                        default -> System.out.println("Enter correct value and try again");
                    }
                }
                case 2 -> {
                    System.out.println("Enter dimensions of rectangle - \nEnter Length: ");
                    double length = sc.nextDouble();
                    System.out.println("Enter Breadth: ");
                    double breadth = sc.nextDouble();
                    switch (action) {
                        case 1 -> System.out.println("Area of Rectangle = " + length * breadth);
                        case 2 -> System.out.println("Perimeter of Rectangle = " + 2 * (length + breadth));
                        default -> System.out.println("Enter correct value and try again");
                    }
                }
                case 3 -> {
                    System.out.println("Enter side of Square: ");
                    double side = sc.nextDouble();
                    switch (action) {
                        case 1 -> System.out.println("Area of Side = " + side * side);
                        case 2 -> System.out.println("Perimeter of Side = " + 4 * side);
                        default -> System.out.println("Enter correct value and try again");
                    }
                }
                case 4 -> {
                    System.out.println("Enter dimensions of Triangle- \nEnter Side 1: ");
                    double s1 = sc.nextDouble();
                    System.out.println("Enter Side 2: ");
                    double s2 = sc.nextDouble();
                    System.out.println("Enter Side 3: ");
                    double s3 = sc.nextDouble();
                    switch (action) {
                        case 1 -> {
                            double s = (s1 + s2 + s3) / 2;
                            System.out.println("Area of Triangle = " + sqrt(s * (s - s1) * (s - s2) * (s - s3)));
                        }
                        case 2 -> System.out.println("Perimeter of Triangle = " + s1 + s2 + s3);
                        default -> System.out.println("Enter correct value and try again");
                    }
                }
                case 5 -> flag = false;
                default -> System.out.println("\nEnter Correct values");
            }
        }
    }
}
