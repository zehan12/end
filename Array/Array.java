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
        for ( int i = 0 ; i < 10 ; i++ ) {
            numberArr[i] = i+1;
        }

        // 
        for ( int i = 0 ; i < numberArr.length ; i++ ) {
            System.out.println(numberArr[i]);
        }
    }
}