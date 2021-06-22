package menuitem;

import foodtype.Side;

public class FrenchFries extends Side{

	@Override
	public String name() {
		return "French Fries";
	}

	@Override
	public float price() {
		return 1.50f;
	}

}
