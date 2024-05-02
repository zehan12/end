package Pattern.pattern6;

public class Pattern {
    public static void main(String[] args) {
        pattern(8);
    }

    public static void pattern(Integer n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
