package Pattern.pattern9;

public class Pattern {
    public static void main(String[] args) {
        pattern(10);
    }

    public static void pattern(Integer n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
