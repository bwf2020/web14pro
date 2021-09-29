package day6;

import java.io.Serializable;

public class User implements Serializable{


	private static final long serialVersionUID = 71415013932454810L;
	
	
	private int id;
	private String name;
	private String sex;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName2() {
		return name;
	}
	public void setName2(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
}
