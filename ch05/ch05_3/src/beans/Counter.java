package beans;

public class Counter {
	private int count;

	public Counter() {
		count = 0;
	}

	public int getCount() {
		return count++;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
