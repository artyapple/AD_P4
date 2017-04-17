import java.math.BigInteger;

public class BinomCoefPascalsTriangle extends Counter implements PascalsTriangle {
	
	private static final String NAME = "BinomCoefPascalsTriangle";

	@Override
	public String calculateLine(int n) {

		if (n<0 || n>136){
			return "Line value should be a positive integer and MAX == 136";
		}
		BigInteger[] result = new BigInteger[n+1];

		for (int i = 0; i < n + 1; i++) {
			result[i] = bci(n, i);
		}

		StringBuilder str = new StringBuilder();
		for (BigInteger elem : result) {
			str.append(" " + elem);
		}
		return str.toString();
	}

	private BigInteger fakt(int n) {
		BigInteger r = BigInteger.ONE;
		BigInteger ln = BigInteger.valueOf(n);
		while(ln.compareTo(BigInteger.ZERO)==1){
			r = r.multiply(ln);
			ln = ln.subtract(BigInteger.ONE);
		}
		return r;
		
	}

	private BigInteger bci(int n, int k) {
		count();
		BigInteger b = fakt(k).multiply(fakt(n - k));
		
		return fakt(n).divide(b);
	}

	@Override
	public String getName() {
		return NAME;
	}

}
