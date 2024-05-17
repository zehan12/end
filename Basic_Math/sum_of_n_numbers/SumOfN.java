package Basic_Math.sum_of_n_numbers;

/**
 * SumOfNNumbers
 */
public class SumOfN {
    public static void main(String[] args) {
        System.out.println("sum : " + sumOfNs(3));
    }

    public static Integer sumOfNs(Integer n) {
        return n * (n + 1) / 2;
    }
}
