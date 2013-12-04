package biz.pavonis;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 implements Solvable {

	private static final long LIMIT = 600851475143l;

	@Override
	public long solve() {
		long ret = 0;
		for (long i = 1; i <= Math.sqrt(LIMIT); i += 2) {
			if (ProblemUtil.isPrime(i) && (LIMIT % i) == 0) {
				ret = i;
			}
		}
		return ret;
	}

}
