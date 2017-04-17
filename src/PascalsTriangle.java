
public interface PascalsTriangle {

	/**
	 * calculate specified line in pascal's triangle
	 * 
	 * @param number of line
	 * @return line
	 */
	public String calculateLine(int n);
	
	public String getName();
	
	public long getCount();
	
	public void reset();
}
