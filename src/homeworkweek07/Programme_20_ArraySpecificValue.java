package homeworkweek07;

/**
 * Write a Java program to test if an array contains a specific value.
 */

//Create Class
public class Programme_20_ArraySpecificValue {
    public static void main(String[] args) {
        int[] array= {21,54,84,65,21,57,41,84,73,18,97,41};

        System.out.println(num(array,21));
        System.out.println(num(array, 100));
    }
//Create Static Method
    public static boolean num(int[] arr, int num) {
        //
        //Declare Loop
        for (int x : arr) {
            if (x == num)
                return true;
        }
        return false;
    }

}

