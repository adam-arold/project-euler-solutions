package biz.pavonis;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 implements Solvable {

	private class PythagoreanTriple {
		int a;
		int b;
		int c;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		public int getC() {
			return c;
		}

		public void setC(int c) {
			this.c = c;
		}
	}

	@Override
	public long solve() {
		long ret = 0;
		PythagoreanTriple t = null;
		tripletsearch: for (int m = 2; m < 25; m++) {
			for (int n = 1; n < m; n++) {
				t = generateTripleFrom(m, n);
				if (t.getA() + t.getB() + t.getC() == 1000) {
					break tripletsearch;
				}
			}
		}
		if (t != null) {
			ret = t.getA() * t.getB() * t.getC();
		}
		return ret;
	}

	private PythagoreanTriple generateTripleFrom(int m, int n) {
		PythagoreanTriple pt = new PythagoreanTriple();
		pt.setA(m * m - n * n);
		pt.setB(2 * m * n);
		pt.setC(m * m + n * n);
		return pt;
	}
}
