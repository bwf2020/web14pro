package day9;

import java.io.Serializable;

public class User implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3529964257850076861L;
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
