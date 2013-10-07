package biz.pavonis;

/**
 * Problem 7.
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
