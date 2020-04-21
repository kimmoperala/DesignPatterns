package builder;

import java.util.*;

public class Burger {
	private List<String> ingredients = new ArrayList<String>();
	
	public void setIngredients(List<String> ingredients){
		this.ingredients = ingredients;
	}
	public List<String> getIngredients() {
		return this.ingredients;
	}
	public String toString() {
		String list = "";
		int i = 0;
		while (i < ingredients.size()-1) {
			list += ingredients.get(i) + ", ";
			i++;
		}
		list += ingredients.get(ingredients.size() - 1);
		return list;
	}
}
