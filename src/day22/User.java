package day22;

public class User {

	
	private String name;
	
	private int index;
	
	private int check;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{\"name\":\""+this.name+"\"}";
	}
	
	
	
	
}
