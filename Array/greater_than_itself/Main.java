package Array.greater_than_itself;

public class Main {
    public static void main(String[] args) {
        int[] items = new int[] { -3, 2, 6, 8, 4, 8, 5 };
        int[] items2 = new int[] { 2, 3, 10, 7, 3, 2, 10, 8 };
        int[] items3 = new int[] { 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 };
        int[] items4 = new int[] { 8, 8, 8, 8, 8, 8, 8, 8 };

        System.out.println("Count :" + countGreaterThanItself(items, items.length));
        System.out.println("Count :" + countGreaterThanItself(items2, items2.length));
        System.out.println("Count :" + countGreaterThanItself(items3, items3.length));
        System.out.println("Count :" + countGreaterThanItself(items4, items4.length));

    }

    public static int countGreaterThanItself(int[] arr, int n) {
        int max = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                count++;
            }
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        return count;
    }
}