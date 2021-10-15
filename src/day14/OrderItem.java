package day14;

public class OrderItem {

	
	
	private int id;
	
	private int nums;
	
	private Orders orders;
	private Product product;
	
	

	public Orders getOrders() {
		return orders;
	}


	public void setOrders(Orders orders) {
		this.orders = orders;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNums() {
		return nums;
	}


	public void setNums(int nums) {
		this.nums = nums;
	}

	
	
	
}
