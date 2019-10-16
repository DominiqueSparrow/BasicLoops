package collections.maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class LoopTest {

	@Test
	public void loopTest() {
		String[] arr = new String[] { "a", "b", "c", "d", "e", "f" };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		List<String> ls = new ArrayList<>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		ls.add("e");
		ls.add("f");
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}

		for (String s : ls) {
			System.out.println(s);
		}

	}

	@Test
	public void setTest() {

		int min_num = 50;

		Set<Integer> numbers = new HashSet<>();

		for (int i = 2; i <= min_num; i++) {
			numbers.add(i);
		}

		for (int num = 2; num <= min_num; num++) {
			if (numbers.contains(num)) {
				System.out.println("Liczba pierwsza " + num);
				for (int w = num * 2; w <= min_num; w += num) {
					System.out.println("Kasujemy " + w);
					numbers.remove(w);
				}
			}

		}

		for (Integer i : numbers) {
			System.out.println("Liczba " + i);
		}
	}

	@Test
	public void dot() {
		String a = "ccc";
		System.out.println(a.substring(1).concat("3").substring(2).length());

	}

}
