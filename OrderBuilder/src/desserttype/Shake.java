package desserttype;

import structure.FoodType;
import structure.Item;

public abstract class Shake implements Item{

	@Override
	public abstract float price();

	@Override
	public FoodType foodType() {
		return new Dessert();
	}

}
