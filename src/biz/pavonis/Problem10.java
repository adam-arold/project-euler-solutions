package biz.pavonis;

/**
 * Problem 10.
 * <pre>
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * </pre>
 */
public class Problem10 implements Solvable {

	private static final int LIMIT = 2000000;

	@Override
	public long solve() {
		long ret = 0;
		for (int i = 1; i < LIMIT; i += 2) {
			if (ProblemUtil.isPrime(i)) {
				ret += i;
			}
		}
		return ret + 2;
	}
}
