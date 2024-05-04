package Basic_Math.factor_count;

import java.util.*;

public class FactorCount {
    public static void main(String[] args) {
        System.out.println("factor count  : " + factorCount(36));
    }

    // // brute force
    // public static Integer factorCount(Integer n) {
    // for (int i = 1; i * i < n; i++) {
    // if (n % i == 0) {
    // System.out.println(i);
    // }
    // }
    // return n;
    // }

    public static Integer factorCount(Integer n) {
        int factorCount = 0;
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    factorCount += 1;
                    divisors.add(i);
                } else {
                    factorCount += 2;
                    divisors.add(i);
                    divisors.add(n / i);
                }
            }
        }
        System.out.println(divisors);
        return factorCount;
    }
}
