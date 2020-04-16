package builder;

public class Steak implements Ingredient {
	private String name;
	
	public Steak(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}
