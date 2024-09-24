import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbersArray = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(reverseArray(numbersArray)));
    }

    public static int[] reverseArray(int[] arr) {
        int temp;
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }
}
