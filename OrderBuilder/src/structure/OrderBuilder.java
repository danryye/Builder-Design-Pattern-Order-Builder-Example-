package structure;

import menuitem.*;

public class OrderBuilder {
	public Order burgerMeal() {
		Order order = new Order();
		order.addItem(new Hamburger());
		order.addItem(new FrenchFries());
		order.addItem(new Pepsi());
		
		return order;
	}
	
	public Order nuggetMeal() {
		Order order = new Order();
		order.addItem(new ChickenNuggets());
		order.addItem(new FrenchFries());
		order.addItem(new Pepsi());
		
		return order;
	}
	
	public Order vegeMeal() {
		Order order = new Order();
		order.addItem(new VegeBurger());
		order.addItem(new FrenchFries());
		order.addItem(new Pepsi());
		
		return order;
	}
}
