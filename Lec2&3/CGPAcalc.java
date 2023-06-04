package Assignments;

import java.util.Scanner;

public class CGPAcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter GPA of subjects : \nMaths: ");
        double maths=sc.nextInt();
        System.out.println("English: ");
        double eng=sc.nextInt();
        System.out.println("Data Structures: ");
        double ds=sc.nextInt();
        System.out.println("DBMS");
        double db=sc.nextInt();
        System.out.println("Operating System: ");
        double os=sc.nextInt();


//        for (int i= 1;i<=n;i++ ){
//            System.out.println("Enter marks of subject "+i)using arrays
//        }
        double CGPA =(maths+eng+ds+db+os)/5;
        System.out.println("Average CGPA= "+CGPA);
        double CGPAper = (float)(9.5*CGPA);
        System.out.println("CGPA percent = "+CGPAper);

        }

}
