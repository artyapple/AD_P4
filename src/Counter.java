public class Counter {

	private long count = 0;

	public long getCount() {
		return count;
	}

	public void count() {
		count++;
	}

	public void reset() {
		count = 0;
	}
}