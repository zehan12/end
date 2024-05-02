package Pattern.pattern7;

public class Pattern {
    static public void main(String[] args) {
        pattern(9);
    }

    static public void pattern(Integer n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n -i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
