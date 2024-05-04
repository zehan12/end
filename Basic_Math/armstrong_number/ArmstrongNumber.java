package Basic_Math.armstrong_number;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("armstrongNumber: " + armstrongNumber(1634));
    }

    public static boolean armstrongNumber(Integer n) {
        int digitCount = n.toString().length();
        int lastDigit = 0;
        int result = 0;
        int digit = n;
        while (n > 0) {
            lastDigit = n % 10;
            result += Math.pow(lastDigit, digitCount);
            n = n / 10;
        }
        return result == digit;
    }
}