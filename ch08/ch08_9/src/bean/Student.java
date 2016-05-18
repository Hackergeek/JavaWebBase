package bean;

public class Student {
	private String sno, sname, sex;

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Student(String sno, String sname, String sex) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sex = sex;
	}

}
