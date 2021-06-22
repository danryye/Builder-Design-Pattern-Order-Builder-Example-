package menuitem;

import desserttype.Shake;

public class Sundae extends Shake{

	@Override
	public String name() {
		return "Sundae";
	}

	@Override
	public float price() {
		return 1.50f;
	}

}
