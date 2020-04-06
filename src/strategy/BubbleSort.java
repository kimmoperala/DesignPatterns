package strategy;

public class BubbleSort implements SortingStrategy {

	@Override
	public int[] sort (int numbers[]) {
		
		int n = numbers.length;
		int k;
		for (int m = n; m>= 0; m--) {
			for (int i = 0; i < n-1; i++) {
				k = i + 1;
				if (numbers[i] > numbers[k]) {
					swapNumbers(i, k, numbers);
				}
			}
		}
		return numbers;
	}
	
	private static void swapNumbers(int i, int j, int[] numbers) {
		int temp;
		temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

}
