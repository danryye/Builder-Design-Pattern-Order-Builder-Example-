package menuitem;
import foodtype.Burger;

public class Hamburger extends Burger{

	@Override
	public String name() {
		return "Hamburger";
	}

	@Override
	public float price() {
		return 1.50f;
	}

}
