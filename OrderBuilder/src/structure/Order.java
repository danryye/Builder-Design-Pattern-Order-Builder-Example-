package structure;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.00f;
		
		for(Item item: items) {
			cost+=item.price();
		}
		
		return cost;
	}
	
	public void showItems() {
		for(Item item: items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Food Type : " + item.foodType().foodType());
			System.out.print(", Price : " + item.price());
		}
	}
}
