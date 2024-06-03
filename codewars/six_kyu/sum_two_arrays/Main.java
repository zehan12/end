package codewars.six_kyu.sum_two_arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 3, 2, 9 };
        int[] arr2 = new int[] { 1, 2 };
        int[] result = sumArray(arr1, arr2);
        System.out.println(arrayToString(result));
    }

    public static int[] sumArray(int[] arr1, int[] arr2) {
        StringBuilder str1 = arrayToString(arr1);
        StringBuilder str2 = arrayToString(arr2);
        Integer total = Integer.parseInt(str1.toString()) + Integer.parseInt(str2.toString());
        return stringToArray(new StringBuilder(total.toString()));
    }

    public static StringBuilder arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb;
    }

    public static int[] stringToArray(StringBuilder str) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        return arr;
    }
}
