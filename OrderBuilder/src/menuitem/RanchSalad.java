package menuitem;

import foodtype.Salad;

public class RanchSalad extends Salad{

	@Override
	public String name() {
		return "Ranch Salad";
	}

	@Override
	public float price() {
		return 4.75f;
	}

}
