package Basic_Math.perfect_square;

public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println("perfect square :" + perfectSquare(25));
    }

    public static Integer perfectSquare(Integer n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                return i;
            }
        }
        return -1;
    }

}