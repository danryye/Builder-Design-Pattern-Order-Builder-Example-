package menuitem;
import foodtype.Burger;

public class VegeBurger extends Burger{

	@Override
	public String name() {
		return "VegeBurger";
	}

	@Override
	public float price() {
		return 2.50f;
	}

}
