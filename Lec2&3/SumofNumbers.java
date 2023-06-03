package Assignments;

import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum=0;
        do
        {
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            sum=sum+number;
        }while(number !=0);
        System.out.println("\nSum = "+sum);
    }
}
