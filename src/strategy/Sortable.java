package strategy;

public class Sortable {
	
	private SortingStrategy strategy;
	
	public Sortable() {
	}
	
	public int[] returnSortedArray(int[] array) {
		return this.strategy.sort(array);
	}
	
	public void setStrategy(SortingStrategy strategy) {
		this.strategy = strategy;
	}
}
