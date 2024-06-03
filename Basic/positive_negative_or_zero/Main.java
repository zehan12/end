package Basic.positive_negative_or_zero;

class Main {
    public static void main(String[] args) {
        System.out.println(result(0));
        System.out.println(result(1));
        System.out.println(result(-1));        
    }

    public static int result(int n) {
        return (n > 0) ? 1 : (n < 0) ? -1 : 0;
    }
}
