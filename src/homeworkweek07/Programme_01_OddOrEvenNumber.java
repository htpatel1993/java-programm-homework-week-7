package homeworkweek07;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

//Create Main Class
public class Programme_01_OddOrEvenNumber {
    //Create Main Method
    public static void main(String[] args) {
        //Declare Scanner
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num = user.nextInt();
        //Using Ternary operator
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);
        user.close();
    }
}
