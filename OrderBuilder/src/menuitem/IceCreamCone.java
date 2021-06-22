package menuitem;

import desserttype.IceCream;

public class IceCreamCone extends IceCream{

	@Override
	public String name() {
		return "IceCreamCone";
	}

	@Override
	public float price() {
		return 1.00f;
	}

}
