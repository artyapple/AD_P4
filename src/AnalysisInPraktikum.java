

public class AnalysisInPraktikum {

	public static void pascalZeileBerechnen(int zn) {
		int[] zeile = new int[zn + 1];
		int n = zn;
		int v = 1;
		zeile[0] = v;
		
		int i = 0;
				
		for (int k = 0; k < n; k++) {
			v = ((n-k)*v) / (k+1);
			zeile[++i] = v;
		}
		print(zeile);
	}
	
	public static void print(int[] zeile){
		System.out.print("Zeile "+(zeile.length-1) +":");
		for (int n : zeile) {
			
			System.out.print(n+ " ");
		}
		System.out.println(" ");
	}
	
	private static int fakt(int n) {
		int r = 1;
		int ln = n;
		while(ln>0){
			r = r*ln;
			ln = ln-1;
		}
		return r;
		
	}

}
