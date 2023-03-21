package homeworkweek07;

/**
 * Write a Java program to sum values of an array.
 */

//Create Class
public class Programme_18_Array {
    public static void main(String[] args) {
        //Call to instance method to main method
        Programme_18_Array obj = new Programme_18_Array();
        obj.sum();
    }

    //Declare Instance Method.
    public void sum() {
        //Array Declaration
        int my_array[] = {1, 11, 21, 31, 41, 51, 61, 71, 81, 91, 101};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}


