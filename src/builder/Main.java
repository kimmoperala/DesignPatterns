package builder;

public class Main {

	public static void main(String[] args) {
		OrderDirector director = new OrderDirector();
		BurgerBuilder hese = new Hesburger();
		BurgerBuilder makki = new McDonalds();
		Burger burger;
		
		director.setBurgerBuilder(hese);
		director.constructBurger();
		burger = director.getBurger();

		System.out.println("Ainekset: " + burger.toString());
		
		director.setBurgerBuilder(makki);
		director.constructBurger();
		burger = director.getBurger();
		
		System.out.println("Ainekset: " + burger.toString());
	}

}
