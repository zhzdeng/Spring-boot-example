package tmy.demo.module;

public class Order {
	private String foodName;
	private int number;
	private double totalPrice;
	
	public Order(String foodName, int number, double totalPrice) {
		this.foodName = foodName;
		this.number = number;
		this.totalPrice = totalPrice;
	}
	
	public Order() {}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Override
	public String toString() {
		return "Order [foodName=" + foodName + ", number=" + number +
				", totalPrice=" + totalPrice + "]";
	}
	
}