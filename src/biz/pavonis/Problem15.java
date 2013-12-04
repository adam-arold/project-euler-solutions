package biz.pavonis;

import static biz.pavonis.ProblemUtil.factorial;

import java.math.BigInteger;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 */
public class Problem15 implements Solvable {
	
	/**
	 * This is just one permutation with repetition: 40! / (20! * 20!) = 137846528820
	 */
	@Override
	public long solve() {
		return factorial(new BigInteger("40")).divide(factorial(new BigInteger("20")).multiply(factorial(new BigInteger("20")))).longValue();
	}
}
