package Pattern.pattern2;

public class Pattern {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(Integer x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
