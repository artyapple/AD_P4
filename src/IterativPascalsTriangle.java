import java.math.BigInteger;


public class IterativPascalsTriangle extends Counter implements PascalsTriangle {
	
	private static final String NAME = "IterativPascalsTriangle";

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
			//BigInteger[] startzeile = new BigInteger[] { BigInteger.ONE,BigInteger.ONE };
			//BigInteger[] result = pascals(n, startzeile);	
			
			BigInteger[][] dreieck = new BigInteger[n+1][n+1];
			
			for (int i = 0; i < dreieck.length; i++) {
				count();
				dreieck[i][0] = BigInteger.ONE;
				dreieck[0][i] = BigInteger.ONE;
			}
			
			for(int i=1;i<=n;i++){
				for (int j = i; j <= n-i; j++) {
					count();
					dreieck[i][j] = dreieck[i][j-1].add(dreieck[i-1][j]);
					dreieck[j][i] = dreieck[i][j-1].add(dreieck[i-1][j]);
				}
				
			}
			
			for(int i=0;i<=n;i++){
					if(dreieck[i][n-i]==null){
						str.append(" " + 0);
					}else{

						str.append(" " + dreieck[i][n-i]);
					}
			}
			
			return str.toString();
		}	
	}

	@Override
	public String getName() {
		return NAME;
	}

}
