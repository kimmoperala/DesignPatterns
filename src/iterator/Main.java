package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Iterable collection
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			numbers.add(i);
		}
		
		// a) Iterate the collection with 2 threads simultaneously with their own iterators.
		final class SaieA extends Thread{
			private int id;
			
			public SaieA(int id) {
				this.id = id;
			}
			public void run() {
				Iterator<Integer> aIterator = numbers.iterator();
				while (aIterator.hasNext()) {
					System.out.println("Thread " + id + " iterated number " + aIterator.next());
				}
			}
		}
		
		// iterator for b) c) and d)
		Iterator<Integer> bIterator = numbers.iterator();

		
		// b) Threads use the same iterator in turns
		final class SaieB extends Thread {
			private int id = 1;
			
			public SaieB(int id) {
				this.id = id;
			}
			public void run() {
				while(bIterator.hasNext()) {
					Integer value = bIterator.next();
					System.out.println("Thread " + id + " iterated number " + value);
				}
			}
		}
		
		// c) Collection is modified during iteration
		final class SaieC extends Thread {
			private int id = 1;
			
			public SaieC(int id) {
				this.id = id;
			}
			public void run() {
				while(bIterator.hasNext()) {
					Integer value = bIterator.next();
					System.out.println("Thread " + id + " iterated number " + value);
					if (value == 14) {
						numbers.remove(30);
					}
				}
			}
		}
		
		// d) Remove operation of iteration
				final class SaieD extends Thread {
					private int id = 1;
					
					public SaieD(int id) {
						this.id = id;
					}
					public void run() {
						while(bIterator.hasNext()) {
							Integer value = bIterator.next();
							System.out.println("Thread " + id + " iterated number " + value);
							if (value % 3 == 0) {
								bIterator.remove();
							}
						}
						System.out.println(numbers);
					}
				}
		
		SaieA saie1 = new SaieA(1);
		SaieA saie2 = new SaieA(2);
		
		SaieB saie3 = new SaieB(1);
		SaieB saie4 = new SaieB(2);
		
		SaieC saie5 = new SaieC(1);
		
		SaieD saie6 = new SaieD(1);


		while (true) {
			System.out.println("Valitse tehtävän kohta: a, b, c, d");
			String data = reader.next();
			char selected = data.charAt(0);
			if (selected == 'a') {
				saie1.start();
				saie2.start();
				break;
			} else if (selected == 'b') {
				saie3.start();
				saie4.start();
				break;
			} else if (selected == 'c') {
				saie5.start();
				break;
			} else if (selected == 'd') {
				saie6.start();
				break;
			}
		}
		
	}

}
