package Basic_Math.power;

/**
 * Power
 */
public class Power {
    public static void main(String[] args) {
        System.out.println("power :" + power(2, 3));
    }

    public static Integer power(Integer num, Integer pow) {
        int res = 1;
        while (pow > 0) {
            if (pow % 2 == 1) {
                res = res * num;
            }
            num = num * num;
            pow = pow / 2;
        }
        return res;
    }
}