package menuitem;

import drinktype.Beverage;

public class Coke extends Beverage{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 1.00f;
	}

}
