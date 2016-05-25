package action;

public class Action {
	private int x;
	private int y;
	private int sum;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSum() {
		return sum;
	}

	public String execute() {
		sum = x + y;
		if (sum >= 0)
			return "+";
		else
			return "-";
	}
}
