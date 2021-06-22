package menuitem;
import foodtype.Burger;

public class Cheeseburger extends Burger{

	@Override
	public String name() {
		return "Cheeseburger";
	}

	@Override
	public float price() {
		return 2.00f;
	}

}
