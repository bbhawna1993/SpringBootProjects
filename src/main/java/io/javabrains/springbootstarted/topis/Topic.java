package io.javabrains.springbootstarted.topis;

public class Topic {

	Integer id;
	String desc;
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Topic(Integer id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}

}
