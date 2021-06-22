package foodtype;

import structure.FoodType;
import structure.Item;

public abstract class Side implements Item{

	public abstract float price();

	@Override
	public FoodType foodType() {
		return new Food();
	}
}
