package homeworkweek07;
/**
 * Write a java program to input any number and find out if it’s odd or even.
 */

import java.util.Scanner;

//Create Class
public class Programme_06_FindOddOrEven {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = user.nextInt();
//use if
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
