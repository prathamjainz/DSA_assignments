package Assignments;

import java.util.Scanner;
//1 to 100 units – Rs. 10/unit
//100 to 200 units – Rs. 15/unit
//200 to 300 units – Rs. 20/unit
//above 300 units – Rs. 25/unit

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed : ");
        float units= sc.nextFloat();
        float total=0;
        if (units<=100){
            total=units*10;
        }
        else if(units <=200){
            total= 100*10+(units-100)*15;
        }
        else if (units <=300){
            total = 100*10 + 200*15 +(units-200)*20;
        }
        else {
            total = 100*10+ 200*15 +300*20 +(units-300)*25;
        }
        System.out.println("Total amount to be paid = "+ total);
    }
}
