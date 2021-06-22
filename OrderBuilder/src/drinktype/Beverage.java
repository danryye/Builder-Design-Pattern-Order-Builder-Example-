package drinktype;

import structure.FoodType;
import structure.Item;

public abstract class Beverage implements Item{

	public abstract float price();

	@Override
	public FoodType foodType() {
		return new Drink();
	}

}
