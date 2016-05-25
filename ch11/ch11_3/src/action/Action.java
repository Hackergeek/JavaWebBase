package action;

public class Action {
	private int x, y;
	private int value; // 用于存放计算结果
	private String msg; // 用于存放计算信息

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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	// 求和方法
	public String add() throws Exception {
		value = x + y;
		msg = "你选择的是求和运算！";
		return "show";
	}

	// 求差方法
	public String sub() throws Exception {
		value = x - y;
		msg = "你选择的是求差运算！";
		return "show";
	}

	// 求积方法
	public String mul() throws Exception {
		value = x * y;
		msg = "你选择的是求积运算！";
		return "show";
	}

	// 求商方法
	public String div() throws Exception {
		value = x / y;
		msg = "你选择的是求商运算！";
		return "show";
	}

}
