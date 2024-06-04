package Array.paris_sum;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, -2, 1, 4, 3, 6, 8 };
        int[] arr1 = new int[] { 3, 5, 2, 1, -3, 7, 8, 15, 6, 13 };
        System.out.println(pairs(arr, 10));
        System.out.println(pairs(arr1, 10));
    }

    public static boolean pairs(int[] arr, int k) {
        for ( int i = 0 ; i < arr.length ; i++ ) {
            for ( int j = i + 1 ; j < arr.length ; j++ ) {
                if ( arr[i] + arr[j] == k ) {
                    return true;
                }
            }
        }
        return false;
    }

    // public static boolean pairs(int[] arr, int k) {
    //     int pairs = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i; j < arr.length; j++) {
    //             if (arr[i] + arr[j] == k && i != j) {
    //                 pairs += 1;
    //                 System.out.println("(" + i + "," + j + ")");
    //             }
    //         }
    //     }

    //     if ( pairs > 0 ) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

}
