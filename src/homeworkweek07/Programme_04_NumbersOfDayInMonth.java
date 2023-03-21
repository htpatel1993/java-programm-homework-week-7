package homeworkweek07;

import java.util.Scanner;

public class Programme_04_NumbersOfDayInMonth {
    public static void main(String[] args) {
        //Declare a scanner statement
        Scanner scanner = new Scanner(System.in);
        //Create a print statement
        System.out.print("Input Any year  : ");
        //Create a variable to store the variable.
        int year = scanner.nextInt();
        //Create a print statement
        System.out.print("Input month of the year : ");
        //Declare a variable to  store the variable
        int month = scanner.nextInt();
        //Call static method into main method
        isLeapYear(year, month);
        //call static method into main method
        getDaysInMonth(year, month);
        //Close scanner statement
        scanner.close();
    }

    //Create a static method with parameters
    public static void isLeapYear(int year, int month) {
        //Declare if and else statement to define conditions for leap year
        if (year <= 0 && year >= 9999) {
            //Create a print statement
            System.out.println(year + "  is not in range. ");
            //Define another condition
        } else if (month <= 0 && month >= 12) {
            //Create a  print statement
            System.out.println(month + " is not in range.");
            //Define a another condition
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            //Create a print statement
            System.out.println(year + " is a leap year.");
            //Define exit condition from the if else statement.
        } else {
            //Define a print statement
            System.out.println(year + " is not a leap year.");
        }

    }

    //Create a new static method.
    public static void getDaysInMonth(int year, int month) {

//
//        YearMonth ym = YearMonth.of(year, month);
//        int days = ym.lengthOfMonth();
//        System.out.println(month + " month " + " has " + days + " da

        //Declare a switch statement
        switch (month) {
            case 1:
                System.out.println(" 31 Days in January  " + year);
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("29 Days in February " + year);
                } else {
                    System.out.println("28 Days in February " + year);
                }
                break;

            case 3:
                System.out.println(" 31 Days in March " + year);
                break;

            case 4:
                System.out.println(" 30 Days in April " + year);
                break;
            case 5:
                System.out.println(" 31 Days in May " + year);
                break;

            case 6:
                System.out.println(" 30 Days in June " + year);
                break;

            case 7:
                System.out.println(" 31 Days in July " + year);
                break;
            case 8:
                System.out.println(" 31 Days in August " + year);
                break;

            case 9:
                System.out.println(" 30 Days in September " + year);
                break;
            case 10:
                System.out.println(" 31 Days in October " + year);
                break;

            case 11:
                System.out.println(" 30 Days in November " + year);
                break;
            case 12:
                System.out.println(" 31 Days in December " + year);
                break;
            default:
                System.out.println("Enter Valid month number between 1 to 12 ");

        }
    }
}



