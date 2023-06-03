package Assignments;

import java.util.Scanner;
//Subtract the Product and Sum of Digits of an Integer
public class subractnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int temp=num;
        int rem=0,sum=0,product=1;
        while (temp!=0)
        {
            rem =temp%10;
            sum = sum+rem;
            product=product*rem;
            temp=temp/10;
        }
        System.out.println("The difference of Product and sum of digits of "+num+"  = "+(product-sum));
    }
}
