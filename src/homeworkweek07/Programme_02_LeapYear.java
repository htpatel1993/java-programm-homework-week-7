package homeworkweek07;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Programme_02_LeapYear {
    //Create Class
    public static void main(String[] args) {
        System.out.println("Enter Any Year");
        //Declare Scanner
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //call to instance method in main method
        Programme_02_LeapYear obj = new Programme_02_LeapYear();
        obj.year(num);
        scan.close();
    }

    //Create Instance Method
    public void year(int num) {
        //Use if formula
        if (num % 4 == 0 || num % 100 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

}







