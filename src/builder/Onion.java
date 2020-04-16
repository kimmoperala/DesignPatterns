package builder;

public class Onion implements Ingredient {
	private String name;
	
	public Onion(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}
