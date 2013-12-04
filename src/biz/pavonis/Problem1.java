package biz.pavonis;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 implements Solvable {

	private static final int LIMIT = 1000;

	@Override
	public long solve() {
		int ret = 0;
		for (int i = 1; i < LIMIT; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				ret += i;
			}
		}
		return ret;
	}

}
