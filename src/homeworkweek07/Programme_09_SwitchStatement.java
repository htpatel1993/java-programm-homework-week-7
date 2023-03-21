package homeworkweek07;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */
//Create Main Class
public class Programme_09_SwitchStatement {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);
        System.out.println("Enter Any Alphabet between A to F :  ");
        String city = area.next();
        String cityName = city.toUpperCase();
        Programme_09_SwitchStatement obj = new Programme_09_SwitchStatement();
        obj.cityName(cityName);
        area.close();

    }

    public void cityName(String cityName) {

        switch (cityName) {
            case "A":
                System.out.println("Alperton");
                break;
            case "B":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Croydon");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("East London");
                break;
            case "F":
                System.out.println("Foshan");
                break;
            default:
                System.out.println("Enter a valid Alphabet");

        }
    }
}



