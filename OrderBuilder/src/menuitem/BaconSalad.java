package menuitem;

import foodtype.Salad;

public class BaconSalad extends Salad{

	@Override
	public String name() {
		return "Bacon Salad";
	}

	@Override
	public float price() {
		return 4.50f;
	}

}
