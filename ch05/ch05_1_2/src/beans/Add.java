package beans;

public class Add {
	private int shuju1;
	private int shuju2;
	private int sum;

	public Add() {
	}

	public int getShuju1() {
		return shuju1;
	}

	public void setShuju1(int shuju1) {
		this.shuju1 = shuju1;
	}

	public int getShuju2() {
		return shuju2;
	}

	public void setShuju2(int shuju2) {
		this.shuju2 = shuju2;
	}

	public int getSum() {
		return shuju1 + shuju2;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
