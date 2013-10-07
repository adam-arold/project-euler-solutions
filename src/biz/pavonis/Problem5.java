package biz.pavonis;

/**
 * Problem 5.
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
