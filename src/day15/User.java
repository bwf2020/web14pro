package day15;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8615810337826897190L;
	private int id;
	private String name;
	private String sex;
	 

	private List<Tel> telList;
	

	
	public List<Tel> getTelList() {
		return telList;
	}
	public void setTelList(List<Tel> telList) {
		this.telList = telList;
	}
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
