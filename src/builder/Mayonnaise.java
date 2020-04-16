package builder;

public class Mayonnaise implements Ingredient {
	private String name;
	
	public Mayonnaise(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}
