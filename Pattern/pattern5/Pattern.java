package Pattern.pattern5;

public class Pattern {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(Integer n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
