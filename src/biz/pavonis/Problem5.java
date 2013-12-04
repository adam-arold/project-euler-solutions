package biz.pavonis;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 implements Solvable {

	private static final int FROM = 1;
	private static final int TO = 20;

	@Override
	public long solve() {
		long nums[] = new long[20];
		for (long i = FROM; i <= TO; i++) {
			nums[(int) (i - 1)] = i;
		}
		return ProblemUtil.getLeastCommonMultiple(nums);
	}
}
