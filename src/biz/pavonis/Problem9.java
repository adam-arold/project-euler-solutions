package biz.pavonis;

/**
 * Problem 9.
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
