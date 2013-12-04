package biz.pavonis;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Utility class for problem solving.
 */
public final class ProblemUtil {

	/**
	 * Returns whether the provided number is prime or not.
	 * O(sqrt(n)/2)
	 * 
	 * @param n number
	 * @return prime?
	 */
	public static boolean isPrime(long n) {
		boolean isPrime = true;
		for (long i = 3; i <= Math.sqrt(n); i += 2)
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		if ((n % 2 != 0 && isPrime && n > 2) || n == 2) {
			isPrime = true;
		} else {
			isPrime = false;
		}
		return isPrime;
	}

	/**
	 * Returns the next prime number after prime.
	 * 
	 * @param prime prime number
	 * @return next prime
	 */
	public static long getNextPrime(long prime) {
		long next = prime;
		do {
			next++;
		} while (!isPrime(next));
		return next;
	}

	/**
	 * Returns the prime factors of a composite number.
	 * 
	 * @param n number
	 * @return factors (number/power pairs)
	 */
	public static Map<Long, Long> getPrimeFactors(long n) {
		Map<Long, Long> factors = new LinkedHashMap<Long, Long>();
		for (long currPrime = 2, currNum = n; currNum > 1; currPrime = getNextPrime(currPrime)) {
			for (long factor = 1; currNum % currPrime == 0; factor++) {
				currNum = currNum / currPrime;
				factors.put(currPrime, factor);
			}
		}
		return factors;
	}

	/**
	 * Gets the least common multiple of the input array of numbers.
	 * 
	 * @param nums numbers
	 * @return least common multiple
	 */
	public static long getLeastCommonMultiple(long[] nums) {
		long ret = 1;
		Map<Long, Long> result = new HashMap<Long, Long>();
		for (long num : nums) {
			Map<Long, Long> currNum = getPrimeFactors(num);
			for (Long key : currNum.keySet()) {
				if (result.containsKey(key)) {
					if (result.get(key) < currNum.get(key)) {
						result.put(key, currNum.get(key));
					}
				} else {
					result.put(key, currNum.get(key));
				}
			}
		}
		for (Long key : result.keySet()) {
			ret *= Math.pow(key, result.get(key));
		}
		return ret;
	}

	/**
	 * Returns whether the provided number is palindrome or not.
	 * 
	 * @param n number
	 * @return palindrome?
	 */
	public static boolean isPalindrome(long n) {
		return Long.toString(n).equals(new StringBuilder(Long.toString(n)).reverse().toString());
	}
	
	/**
	 * Naive (dumb) implementation of the factorial function.
	 * @param n
	 * @return
	 */
	public static BigInteger factorial(BigInteger n) {
		if(n.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		}
		return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
}