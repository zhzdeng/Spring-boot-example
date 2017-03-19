package tmy.demo.module;

public class Food {
	private String name;
	private String introduction;
	private String price;
	private String discount;
	private String pictureURI;
	
	public Food() {}
	
	public Food(String name) { this.name = name; }
	
	public Food(String name, String introduction, String price, String discount, String pictureURI) {
		this.name = name;
		this.introduction = introduction;
		this.price = price;
		this.discount = discount;
		this.pictureURI = pictureURI;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getPictureURI() {
		return pictureURI;
	}
	public void setPictureURI(String pictureURI) {
		this.pictureURI = pictureURI;
	}
	
	@Override
	public String toString() {
		return "Food [name=" + name + "]"; 
	}
}