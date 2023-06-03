package Nakshatra.Pratham;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
//        int rollno= 51;
//        char letter= 'p';
//        float marks = 98.1f;
//        double largemarks=17236182.231;
//        long badaamarks= 241341344124124L;
//        boolean check= false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name =sc.next();
        System.out.println("Enter Rollnumber : ");
        int rollnumber = sc.nextInt();
        System.out.println("Enter id ");
        long id= sc.nextLong();
        System.out.println("Enter grade in char: ");
        char grade= sc.next().charAt(0);
        System.out.println("\nnNAME = "+name+"\nROLLNUMBER = "+rollnumber+"\nID = "+id+"\nGRADE = "+ grade);
    }
}
