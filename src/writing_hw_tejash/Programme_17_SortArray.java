package writing_hw_tejash;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Write a java program to sort a numeric array and a string array
 */

public class Programme_17_SortArray {

    public static void main(String[] args) {
        //Numeric Array declaration
        int [] numArray = { 1789,2035,1899,2040,1950,2255,7897,1455,787};
        //String Array declaration
        String[] strArray = {"Alpha","Bravo","Delta","Hotel","Mike","Sierra","Peter","Kilo" };
        System.out.println("Actual Numerical Array was: " + Arrays.toString(numArray));
        //Sorting the Array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array was: " + Arrays.toString(strArray));
        System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));
    }
}
