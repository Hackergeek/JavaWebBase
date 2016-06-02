package entity;

//培训信息表
public class Train {
	// 培训编号
	private String tid;
	// 培训项目名称
	private String name;
	// 培训导师
	private String tutor;
	// 人数
	private int count;
	// 培训类型
	private String type;

	public Train() {
	}

	public Train(String tid, String name, String tutor, int count, String type) {
		super();
		this.tid = tid;
		this.name = name;
		this.tutor = tutor;
		this.count = count;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Train [tid=" + tid + ", name=" + name + ", tutor=" + tutor
				+ ", count=" + count + ", type=" + type + "]";
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
