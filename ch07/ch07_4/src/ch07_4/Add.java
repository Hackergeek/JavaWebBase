package ch07_4;

public class Add {
	private int a;
	private int b;

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
		while(x <= b) {
			s += x;
			++x;
		}
		return s;
	}

}
