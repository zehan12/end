package Basic_Math.perfect_number;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("perfect number : " + perfectNumber(6));
    }

    public static Integer perfectNumber(Integer n) {
        if (n == 1) {
            return 0;
        }
        int result = 1;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                result += i;
                if (i != n / i) {
                    result += n / i;
                }
            }
        }
        if (result == n) {
            return result;
        }
        return 0;
    }

}
