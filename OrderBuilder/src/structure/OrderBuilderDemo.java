package structure;

public class OrderBuilderDemo {
	public static void main(String [] args) {
		
		OrderBuilder orderBuilder = new OrderBuilder();
		
		Order burgerMeal = orderBuilder.burgerMeal();
		System.out.println(" Burger Meal");
		burgerMeal.showItems();
		System.out.println("Total Cost: " + burgerMeal.getCost());
		
		
		
		Order nuggetMeal = orderBuilder.nuggetMeal();
		System.out.println(" Nugget Meal");
		nuggetMeal.showItems();
		System.out.println("Total Cost: " + nuggetMeal.getCost());
		
	}
}
