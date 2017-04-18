import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		IterativPascalsTriangle iter = new IterativPascalsTriangle();
		
		iter.calculateLine(10);

		int testValues[] = new int[] {0, 1, 5, 10, 20, 35, 50, 75, 100, 136};

		List<PascalsTriangle> list = new ArrayList<>();
		list.add(new RekursivPascalsTriangle());
		
		
		// TODO iteratives Programm hier
		list.add(new IterativPascalsTriangle() );
		
		list.add(new BinomCoefPascalsTriangle());

		for (PascalsTriangle pasc : list) {
			for (int value : testValues) {
				long start = System.nanoTime();
				System.out.println(pasc.calculateLine(value));
				long fin = System.nanoTime() - start;
				
				System.out.println(pasc.getName() + " row number: " + value + "; count: " + pasc.getCount() + "; elapsed time " + fin +" ns" + "\n");
				pasc.reset();
			}
		}
	}

}
