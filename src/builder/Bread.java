package builder;

public class Bread implements Ingredient {
	private String name;
	
	public Bread(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}
