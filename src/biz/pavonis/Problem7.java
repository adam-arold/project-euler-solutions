package biz.pavonis;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
public class Problem7 implements Solvable {

	@Override
	public long solve() {
		long ret = 0;
		for (long i = 1; i <= 10001; i++) {
			ret = ProblemUtil.getNextPrime(ret);
		}
		return ret;
	}
}
