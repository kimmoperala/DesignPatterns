package builder;

import java.util.List;
import java.util.stream.Collectors;

public class OrderDirector {
	private BurgerBuilder burgerBuilder;
	
	public void setBurgerBuilder(BurgerBuilder bb) {
		burgerBuilder = bb;
	}
	public Object getBurger() {
		return burgerBuilder.getBurger();
	}
	public void constructBurger() {
		burgerBuilder.createNewBurger();
		burgerBuilder.buildBread();
		burgerBuilder.buildSteak();
		burgerBuilder.buildOnion();
		burgerBuilder.buildMayonnese();
	}
	public String burgerToString() {
		Object burger = getBurger();
		String ingredients="";
		
		if (burger instanceof List) {
			@SuppressWarnings("unchecked")
			List<Ingredient> burgeri = (List<Ingredient>) getBurger();
			ingredients = burgeri.stream().map(Object::toString).collect(Collectors.joining(", "));
		}
		else if (burger instanceof StringBuilder) {
			ingredients = burger.toString();
		}
		return ingredients;

	}
}
