package biz.pavonis;

import java.math.BigInteger;

/**
 * <pre>
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 * </pre>
 */
public class Problem16 implements Solvable {

	@Override
	public long solve() {
		long ret = 0;
		BigInteger num = new BigInteger("2");
		BigInteger result = num.pow(1000);
		String str = result.toString();
		int[] numArr = new int[str.length()];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.valueOf(String.valueOf(str.charAt(i)));
		}
		BigInteger bigRet = new BigInteger("0");
		for (int i = 0; i < numArr.length; i++) {
			bigRet = bigRet.add(new BigInteger(numArr[i] + ""));
		}
		ret = bigRet.longValue();
		return ret;
	}
}
