package biz.pavonis;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 1^2 + 2^2 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * 
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
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
