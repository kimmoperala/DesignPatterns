package strategy;

import java.util.Random;

public class Main {
	final static int ARRAY_SIZE = 50000;
	final static int NUMBERS_UNDER = 1000;

	public static void main(String[] args) {
		long start, elapsedTime;
		double elapsedTimeInSeconds;
		int[] array = new int[ARRAY_SIZE];

		Random r = new Random();
		for (int i=0; i< ARRAY_SIZE; i++) {
			array[i] = r.nextInt(NUMBERS_UNDER);
		}
		
		System.out.println("Taulukon koko: " + ARRAY_SIZE + ", numerot alle arvon: " + NUMBERS_UNDER);
		System.out.println("Laskee...");

		Sortable sortable = new Sortable();
		sortable.setStrategy(new BubbleSort());
		
		// Start the clock
		start = System.nanoTime();
		int[] returned = sortable.returnSortedArray(array);
		//Stop the clock
		elapsedTime = System.nanoTime() - start;
		elapsedTimeInSeconds = (double) elapsedTime / 1_000_000_000;
		System.out.println("Kuplalajittelun aika: " + elapsedTimeInSeconds);

		/*System.out.println("Kuplalajittelun jälkeen:");

		for (int i: returned) {
			System.out.print(i + ", ");
		}
		System.out.println("");*/
		
		for (int i=0; i< ARRAY_SIZE; i++) {
			array[i] = r.nextInt(NUMBERS_UNDER);
		}
		
		sortable.setStrategy(new InsertionSort());
		
		// Start the clock
		start = System.nanoTime();
		returned = sortable.returnSortedArray(array);
		//Stop the clock
		elapsedTime = System.nanoTime() - start;
		elapsedTimeInSeconds = (double) elapsedTime / 1_000_000_000;
		System.out.println("Lisäyslajittelun aika: " + elapsedTimeInSeconds);

		for (int i=0; i< ARRAY_SIZE; i++) {
			array[i] = r.nextInt(NUMBERS_UNDER);
		}
		
		sortable.setStrategy(new QuickSort());
		
		// Start the clock
		start = System.nanoTime();
		returned = sortable.returnSortedArray(array);
		//Stop the clock
		elapsedTime = System.nanoTime() - start;
		elapsedTimeInSeconds = (double) elapsedTime / 1_000_000_000;
		System.out.println("Pikalajittelun aika: " + elapsedTimeInSeconds);
	}

}
