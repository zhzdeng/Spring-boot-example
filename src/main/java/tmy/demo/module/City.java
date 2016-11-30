package tmy.demo.module;

import java.util.ArrayList;
import java.util.List;

public class City {
	private List<String> foodNameList;

	public City(List<String> foodNameList) {
		this.foodNameList = foodNameList;
	}
	
	public City() { foodNameList = new ArrayList<String>(); }
	
	public List<String> getFoodNameList() {
		return foodNameList;
	}

	public void setFoodNameList(List<String> foodNameList) {
		this.foodNameList = foodNameList;
	}

	public boolean add(String foodName) {
		return foodNameList.add(foodName);
	}
	
	public String get(int index) {
		return foodNameList.get(index);
	}
}