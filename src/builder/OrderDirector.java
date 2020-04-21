package builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDirector {
	private BurgerBuilder burgerBuilder;
	
	public void setBurgerBuilder(BurgerBuilder bb) {
		burgerBuilder = bb;
	}
	
	public Burger getBurger() {
		Burger burger = new Burger();
		Object burgerObjekti = burgerBuilder.getBurger();

		if (burgerObjekti instanceof List) {
			List<String> stringIngredient= new ArrayList<String>();

			for (Ingredient ingredient: (List<Ingredient>) burgerObjekti) {
				stringIngredient.add(ingredient.toString());
			}
			burger.setIngredients(stringIngredient);
		}
		else if (burgerObjekti instanceof StringBuilder) {
			String textBurger = burgerObjekti.toString();
			List<String> burgeri = new ArrayList<String>();
			String[] stringBurger = textBurger.split(",");
			for (String s: stringBurger) {
				burgeri.add(s);
			}
			burger.setIngredients(burgeri);
		}
		return burger;
	}
	
	public void constructBurger() {
		burgerBuilder.createNewBurger();
		burgerBuilder.buildBread();
		burgerBuilder.buildSteak();
		burgerBuilder.buildOnion();
		burgerBuilder.buildMayonnese();
	}
}
