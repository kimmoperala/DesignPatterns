package builder;

public class McDonalds extends BurgerBuilder {

	private StringBuilder stringbuilder;
	
	@Override
	public StringBuilder getBurger() {
		return stringbuilder;
	}

	@Override
	public void createNewBurger() {
		System.out.println("Lisätään leipä");
		stringbuilder = new StringBuilder();
	}

	@Override
	public void buildBread() {
		stringbuilder.append("graham bread McD");
	}

	@Override
	public void buildSteak() {
		System.out.println("Lisätään pihvi");
		stringbuilder.append(", ");
		stringbuilder.append("beef steak McD");
	}

	@Override
	public void buildOnion() {
		System.out.println("Lisätään sipuli");
		stringbuilder.append(", ");
		stringbuilder.append("red onion McD");
	}

	@Override
	public void buildMayonnese() {
		System.out.println("Lisätään majoneesi");
		stringbuilder.append(", ");
		stringbuilder.append("creamy mayonnaise McD");
	}

}
