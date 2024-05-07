package Basic_Math.prime_number;

/**
 * PrimeNumber
 */
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("is prime: "+isPrime(2));
	}
	
	public static boolean isPrime(Integer n) {
		if ( factorCount(n) == 2 ) {
			return true;
		}
		return false;
	}

	public static Integer factorCount(Integer n) {
		int count = 0;
		for ( int i = 1 ; i * i <= n ; i ++ ) {
			if ( n % i == 0 ) {
				if ( n / i == i ) {
					count += 1;
				} else {
					count += 2;
				}
			}
		}
		return count;
	}
}