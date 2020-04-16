package builder;

import java.util.*;

public class Hesburger extends BurgerBuilder {

	private List<Ingredient> hesburgerBurger;
	
	public List<Ingredient> getBurger(){
		return hesburgerBurger;
	}
	
	@Override
	public void createNewBurger() {
		hesburgerBurger = new ArrayList<Ingredient>();
	}
	
	@Override
	public void buildBread() {
		System.out.println("Lisätään leipä");
		Bread bread = new Bread("graham bread Hese");
		hesburgerBurger.add(bread);
	}

	@Override
	public void buildSteak() {
		System.out.println("Lisätään pihvi");
		Steak steak = new Steak("beef steak Hese");
		hesburgerBurger.add(steak);
	}

	@Override
	public void buildOnion() {
		System.out.println("Lisätään sipuli");
		Onion onion = new Onion("red onion Hese");
		hesburgerBurger.add(onion);
	}

	@Override
	public void buildMayonnese() {
		System.out.println("Lisätään majoneesi");
		Mayonnaise mayonnaise = new Mayonnaise("creamy mayonnaise Hese");
		hesburgerBurger.add(mayonnaise);
	}

}
