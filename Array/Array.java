package Array;

/**
 * Array
 */
class Array {
    public static void main(String[] args) {

        // defining the array
        // array explicit initialization
        int[] numberArray = new int[5];
        String[] stringArray = { "joe", "luke", "andrew", "tom", "micheal" };

        // traversal of array
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }

        // traversal of array
        for (int j = 0; j < stringArray.length; j++) {
            System.out.println(stringArray[j]);
        }

        // declaration and initialization of array
        int[] numberArr;
        numberArr = new int[10];

        // inserting value threw index
        for (int i = 0; i < 10; i++) {
            numberArr[i] = i + 1;
        }

        // defining a array
        int[] numbersArrays = new int[] { 1, 2, 3, 4, 5 };

        // update with new value and index
        int updateIndex = 2;
        int updateValue = 6;

        // updating the value
        numbersArrays[updateIndex] = updateValue;

        // inserting value at index
        int insertIndex = 2;
        int insertValue = 6;

        // shifting value to right
        for (int i = numbersArrays.length - 1; i > insertIndex; i--) {
            numbersArrays[i] = numbersArrays[i - 1];
            System.out.println(numbersArrays[i]);
        }

        numbersArrays[insertIndex] = insertValue;

        // deleting value at index
        int deleteIndex = 3;

        // shifting value to left
        for (int i = deleteIndex; i < numbersArrays.length - 1; i++) {
            numbersArrays[i] = numbersArrays[i + 1];
        }

        // fix random value issue
        numbersArrays[numbersArrays.length - 1] = 0;

        // check value after operation
        for (int i = 0; i < numbersArrays.length; i++) {
            System.out.println(numbersArrays[i]);
        }

    }
}