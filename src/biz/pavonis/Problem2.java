package biz.pavonis;

/**
 * Problem2.
 */
public class Problem2 implements Solvable {

	private static final int NUM_LIMIT = 4000000;
	private int product = 0;

	@Override
	public long solve() {
		fibonacci(1, 1);
		return product;
	}

	private int fibonacci(int previous, int current) {
		if (current >= NUM_LIMIT) {
			return current;
		} else {
			if (current % 2 == 0) {
				product += current;
			}
		}
		return fibonacci(current, previous + current);
	}

}
