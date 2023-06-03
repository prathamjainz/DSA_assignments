package Assignments;
//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int max;
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        max= number;
        while(number !=0)
        {
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            if (number>max){
                max=number;
            }
        }
        System.out.println("\nMAX = "+max);
    }
}
