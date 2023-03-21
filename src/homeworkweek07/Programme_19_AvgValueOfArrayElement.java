package homeworkweek07;

/**
 * Write a Java program to calculate the average value of array elements.
 */

//Create Class
public class Programme_19_AvgValueOfArrayElement {
    public static void main(String[] args) {
        //Call to instance method in main method.
        Programme_19_AvgValueOfArrayElement obj = new Programme_19_AvgValueOfArrayElement();
        obj.value();

    }

    //Create Instance method
    public void value() {
        //Array Declaration
        int[] numbers = new int[]{10, 40, 15, 30, -22, -10, -25};
        //calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average Value of the Array Elements is : " + average);
    }
}

