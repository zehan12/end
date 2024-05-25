package Array.iteration;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {
        // initialize static array with elements
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // initialize dynamic array with elements
        ArrayList<Integer> intArrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // iterate static array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // iterate dyanamic array
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(intArrayList.get(i));
        }
    }
}
