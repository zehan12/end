package Math.reverse_number;

/**
 * ReverseNumber
 */
public class ReverseNumber {
    public static void main(String[]  args){
        System.out.println("reverse number: "+ reverseNumber(1234569010));
    }
 
    public static Integer reverseNumber( Integer n ) {
        int reverse = 0;
        int lastDigit;

        while (n > 0) {
            lastDigit = n % 10;
            n = n / 10;
            reverse = (reverse * 10) + lastDigit;
        }

        return reverse;
    }
}