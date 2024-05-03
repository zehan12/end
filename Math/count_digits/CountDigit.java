package Math.count_digits;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println("digit count: "+countDigit(333777));
    }

    public static Integer countDigit(Integer digit) {
        int count = 0;
        int lastDigit;
        while (digit > 0) {
            lastDigit = digit % 10;
            System.out.println(lastDigit);
            digit = digit / 10;
            count++;
        }
        return count;
    }
}