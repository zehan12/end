package Pattern.pattern4;

public class Pattern {
    public static void main(String[] args) {
        pattern(9);
    }

    public static void pattern(Integer n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
