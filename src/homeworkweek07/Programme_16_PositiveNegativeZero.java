package homeworkweek07;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

//Create Class
public class Programme_16_PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        //Declare Scanner
        Scanner number = new Scanner(System.in);
        int digit = number.nextInt();
        //Call to Instance method in main method
        Programme_16_PositiveNegativeZero obj = new Programme_16_PositiveNegativeZero();
        obj.number(digit);
        number.close();
    }

    //Create Instance Method
    public void number(int digit) {
//Use If statement and print statement
        if (digit > 0) {
            System.out.println("Number is positive");
        } else if (digit < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}


