package homeworkweek07;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */
public class Programme_11_DividedBy3Or5 {
    static int i;

    public static void main(String[] args) {
        System.out.println("Value Divided by 3 :   ");
        three();

        System.out.println("\n\n\nValue divided by 5 : ");
        Programme_11_DividedBy3Or5 obj = new Programme_11_DividedBy3Or5();
        obj.five();

    }

    public static void three() {
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");

            }
        }

    }

    public void five() {
        for (i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
