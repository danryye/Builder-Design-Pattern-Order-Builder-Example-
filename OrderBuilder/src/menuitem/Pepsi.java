package menuitem;

import drinktype.Beverage;

public class Pepsi extends Beverage{

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 1.05f;
	}

}
