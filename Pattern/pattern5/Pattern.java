package Pattern.pattern5;

public class Pattern {
    public static void main(String[] args) {
        pattern(7);
    }

    public static void pattern(Integer n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
