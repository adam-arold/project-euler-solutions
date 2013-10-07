package biz.pavonis;

/**
 * Problem 1.
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
