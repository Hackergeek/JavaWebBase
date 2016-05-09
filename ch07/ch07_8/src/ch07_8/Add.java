package ch07_8;

public class Add {
	private int a;
	private int b;

	public Add(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int sum() {
		int c, s = 0;
		if (a > b) {
			c = a;
			a = b;
			b = c;
		}
		int x = a;
		while (x <= b) {
			s += x;
			++x;
		}
		return s;
	}

}
