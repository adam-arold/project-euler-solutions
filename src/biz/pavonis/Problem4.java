package biz.pavonis;

/**
 * Problem 4.
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 implements Solvable {

	private static final int FROM = 999;
	private static final int TO = 111;

	// The palindrome can be written as: abccba Which then simpifies to: 100000a + 10000b + 1000c + 100c + 10b + a
	// And then: 100001a + 10010b + 1100c Factoring out 11, you get: 11(9091a + 910b + 100c) So the palindrome must be
	// divisible by 11.
	// Seeing as 11 is prime, at least one of the numbers must be divisible by 11.

	@Override
	public long solve() {
		long startTime = System.currentTimeMillis();
		long ret = 0;
		for (int i = FROM; i > TO; i--) {
			for (int j = FROM; j > TO; j--) {
				if ((j % 11 == 0 || i % 11 == 0) == false) {
					continue;
				}
				int curr = i * j;
				if (curr > ret && ProblemUtil.isPalindrome(curr)) {
					ret = curr;
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time: " + (endTime - startTime) + "ms.");
		return ret;
	}

}
