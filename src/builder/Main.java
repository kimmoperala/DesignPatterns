package builder;

public class Main {

	public static void main(String[] args) {
		OrderDirector director = new OrderDirector();
		BurgerBuilder hese = new Hesburger();
		BurgerBuilder makki = new McDonalds();
		
		director.setBurgerBuilder(hese);
		director.constructBurger();
		
		System.out.println("Ainekset: " + director.burgerToString());
		
		director.setBurgerBuilder(makki);
		director.constructBurger();
		
		System.out.println("Ainekset: " + director.burgerToString());
	}

}
