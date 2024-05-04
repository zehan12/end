package Basic_Math.palindrome_number;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(12321));
    }

    public static boolean isPalindromeNumber(Integer n) {
        int digit = n;
        int lastDigit = 0;
        int reverse = 0;
        while (n > 0) {
            lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        return digit == reverse;
    }
}