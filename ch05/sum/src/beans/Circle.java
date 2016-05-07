package beans;

public class Circle {
	private int number;	//圆的编号
	private double x;	//圆心x值
	private double y;	//圆心y值
	private double radius;	//半径
	private String color;	//绘制颜色
	private boolean fill;	//是否填充
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	
	public Circle() {
	}
	
	public double circleArea() {
		return Math.PI * radius * radius;
	}
	
	public double circleLength() {
		return Math.PI * radius * 2;
	}
	
}
