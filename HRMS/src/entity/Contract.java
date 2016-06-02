package entity;

//合同信息表
public class Contract {
	// 合同编号
	private String cid;
	// 合同类型
	private String type;
	// 合同年限
	private int year;
	// 薪酬
	private float salary;
	// 员工编号	外键
	private String sid;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Contract [cid=" + cid + ", type=" + type + ", year=" + year
				+ ", salary=" + salary + ", sid=" + sid + "]";
	}

	public Contract() {
	}

	public Contract(String cid, String type, int year, float salary, String sid) {
		this.cid = cid;
		this.type = type;
		this.year = year;
		this.salary = salary;
		this.sid = sid;
	}

}
