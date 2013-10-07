package biz.pavonis;

/**
 * Problem 6.
 */
public class Problem6 implements Solvable {

	private static final int CALCULATE_TO = 100;

	@Override
	public long solve() {
		return squareOfTheSums(CALCULATE_TO) - sumOfTheSquares(CALCULATE_TO);
	}

	private int sumOfTheSquares(int to) {
		int sum = 0;
		for (int i = 1; i <= to; i++) {
			sum += i * i;
		}
		return sum;
	}

	private int squareOfTheSums(int to) {
		int sum = 0;
		for (int i = 1; i <= to; i++) {
			sum += i;
		}
		return sum * sum;
	}
}
