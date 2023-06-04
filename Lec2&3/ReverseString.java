package Assignments;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to be reversed: ");
        String str= sc.nextLine();
        String rev ="";
        char ch;
        for (int i =0;i<str.length();i++){
            ch = str.charAt(i);
            rev= ch + rev;
        }
        System.out.println("Reversed String = "+ rev);
        if(str.equals(rev)){
            System.out.println("\nIt is a palindrome");
        }
        else{
            System.out.println("\nIt is Not a palindrome");
        }

    }
}
