package entity;

import java.util.Date;

//员工信息表
public class Staff {
	// 员工编号
	private String sid;
	// 姓名
	private String name;
	// 性别
	private String sex;
	// 民族
	private String nation;
	// 出生日期
	private Date birthday;
	// 参加工作时间
	private Date worktime;
	// 职务
	private String job;
	// 职称
	private String level;
	// 身份证号
	private String idCard;
	// 地址
	private String address;
	// 手机号
	private String phone;

	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", name=" + name + ", sex=" + sex
				+ ", nation=" + nation + ", birthday=" + birthday
				+ ", worktime=" + worktime + ", job=" + job + ", level="
				+ level + ", idCard=" + idCard + ", address=" + address
				+ ", phone=" + phone + "]";
	}

	public Staff() {
	}

	public Staff(String sid, String name, String sex, String nation,
			Date birthday, Date worktime, String job, String level,
			String idCard, String address, String phone) {
		this.sid = sid;
		this.name = name;
		this.sex = sex;
		this.nation = nation;
		this.birthday = birthday;
		this.worktime = worktime;
		this.job = job;
		this.level = level;
		this.idCard = idCard;
		this.address = address;
		this.phone = phone;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getWorktime() {
		return worktime;
	}

	public void setWorktime(Date worktime) {
		this.worktime = worktime;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
