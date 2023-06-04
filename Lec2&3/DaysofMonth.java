package Assignments;

import java.util.Scanner;
import java.time.LocalDate;

public class DaysofMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year=1;
        // Get number of days in given month of the year
        while (true) {
            System.out.println("----------(enter 0 to terminate)-----------\nEnter the Year :  ");
            year = sc.nextInt();
            if (year==0){
                break;
            }
            System.out.println("Enter Month (1,2,3,...12): ");
            int month = sc.nextInt();
            int numberOfDaysInMonth1 = getNumberOfDaysInMonth(year, month);
            System.out.println("Number of days in Entered month : " + numberOfDaysInMonth1);
        }
//        int numberOfDaysInMonth2 = getNumberOfDaysInMonth(2020, 2);
//        System.out.println("Number of days in Feb 2020: "+numberOfDaysInMonth2);
    }

    // Method to get number of days in month
    public static int getNumberOfDaysInMonth(int year,int month)
    {
        // LocalDate object
        LocalDate date = LocalDate.of(year, month, 1);
        return date.lengthOfMonth();
    }
}


