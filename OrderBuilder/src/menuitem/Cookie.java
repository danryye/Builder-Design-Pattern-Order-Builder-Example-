package menuitem;

import foodtype.Side;

public class Cookie extends Side{

	@Override
	public String name() {
		return "Cookie";
	}

	@Override
	public float price() {
		return 1.00f;
	}

}
