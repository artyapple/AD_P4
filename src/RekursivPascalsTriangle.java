

public class RekursivPascalsTriangle implements PascalsTriangle {

	public static void main(String[] args){
		
		RekursivPascalsTriangle r = new RekursivPascalsTriangle();
		System.out.println(r.calculateLine(5));
		System.out.println(r.calculateLine(10));
		System.out.println(r.calculateLine(20));
		System.out.println(r.calculateLine(200));
	}
	
	@Override
	public String calculateLine(int n) {
		long[] startzeile = new long[]{1, 1};
		long [] result = pascals(n, startzeile);
		StringBuilder str = new StringBuilder();
		for(long elem : result){
			str.append(" " + elem);
		}
		return str.toString();
	}

	private long[] pascals(int n, long[] obereZeile) {
		
		long[] neueZeile = new long[obereZeile.length + 1];
		int pos = 0;
		
		neueZeile[pos++] = 1;
		for (int i = 0; i < obereZeile.length-1; i++) {
				neueZeile[pos++] = obereZeile[i] + obereZeile[i + 1];
		}
		neueZeile[pos] = 1;
		
		if(neueZeile.length-1 == n){
			return neueZeile;
		} else{
			return pascals(n, neueZeile);
		}

	}

}
