package Basic_Math.divide_by_two;

public class DivideByTwo {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Number of times " + number + " can be divided by two: " + countDivisionsByTwo(number));
    }

    public static int countDivisionsByTwo(int n) {
        int count = 0;
        while (n > 1) {
            n = n / 2;
            count++;
        }
        return count;
    }
}
