import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RekursivPascalsTriangle extends Counter implements PascalsTriangle {

	private static final String NAME = "RekursivPascalsTriangle";

	@Override
	public String calculateLine(int n) {
		StringBuilder str = new StringBuilder();
		
		if(n==0){
			count();
			return str.append("1").toString();
		} else if (n==1){
			count();
			return str.append("1 1").toString();
		} else if (n<0 || n>136){
			return "Line value should be a positive integer and MAX == 136";
		} else {
			BigInteger[] startzeile = new BigInteger[] { BigInteger.ONE,BigInteger.ONE };
			BigInteger[] result = pascals(n, startzeile);			
			for (BigInteger elem : result) {
				str.append(" " + elem);
			}
			return str.toString();
		}	
	}

	private BigInteger[] pascals(int n, BigInteger[] obereZeile) {
		count();

		BigInteger[] neueZeile = new BigInteger[obereZeile.length + 1];
		int pos = 0;

		neueZeile[pos++] = BigInteger.valueOf(1);
		for (int i = 0; i < obereZeile.length - 1; i++) {
			neueZeile[pos++] = obereZeile[i].add(obereZeile[i + 1]);
		}
		neueZeile[pos] = BigInteger.valueOf(1);;

		if (neueZeile.length - 1 == n) {
			return neueZeile;
		} else {
			return pascals(n, neueZeile);
		}

	}

	@Override
	public String getName() {
		return NAME;
	}

}
