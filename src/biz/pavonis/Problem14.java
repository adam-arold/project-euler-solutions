package biz.pavonis;
/**
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem14 implements Solvable {

	@Override
	public long solve() {
		long maxTermsSoFar = 0;
		Long bestStartingNumber = null;
		for(long i = 2; i < 1000000; i++) {
			long terms = countCollatzSequenceTerms(i);
			if(terms > maxTermsSoFar) {
				maxTermsSoFar = terms;
				bestStartingNumber = i;
			}
		}
		return bestStartingNumber;
	}

	private long countCollatzSequenceTerms(long startintNumber) {
		long terms = 1;
		long currentTerm = startintNumber;
		while(currentTerm != 1) {
			if(currentTerm % 2 == 0) {
				currentTerm = currentTerm / 2;
			} else {
				currentTerm = (3 * currentTerm) + 1;
			}
			terms++;
		}
		return terms;
	}
}
