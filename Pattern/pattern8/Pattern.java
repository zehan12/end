package Pattern.pattern8;

public class Pattern {
    public static void main(String[] args) {
        pattern(10);
    }

    public static void pattern(Integer n) {
        for (int i = 0; i < n; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
