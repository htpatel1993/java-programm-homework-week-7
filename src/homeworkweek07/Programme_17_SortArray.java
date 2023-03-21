package homeworkweek07;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {
    public static void main(String[] args) {
        //Call to method in main method
        Programme_17_SortArray obj = new Programme_17_SortArray();
        obj.sort();
    }

    //Declare Method
    public void sort() {
//Array Declaration
        int[] my_array1 = {2019, 2025, 1999, 1856, 2023, 1958, 1958, 2054, 1245, 2021, 1235, 2315, 2356, 2456};
        String[] my_array2 = {"India", "USA", "Canada", "UK", "Australia", "New Zealand"};

        System.out.println("Original Array Number : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));
        System.out.println("Original String Array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));

    }
}






