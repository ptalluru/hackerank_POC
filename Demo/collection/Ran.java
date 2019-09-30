package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ran {
	static String[] stringArray = { "e", "z", "f", "a", "t", "u", "a", "b", "c", "m", "f","M","Z","U" };

	static public void main(String... args) {
		/**
		 * storing the array in ArrayList
		 */
		List<String> random = new ArrayList<>(Arrays.asList(Ran.stringArray));
		System.out.println(random);
		/**
		 * Shuffling the list randomly
		 */
		Collections.shuffle(random);
		System.out.println("using aggregate operations like streams....");
		/**
		 * printing the shuffled list using streams
		 */
		random.stream().forEach((r) -> System.out.format("%s", r));
		System.out.println();
		System.out.println("using for each construct....");
		/**
		 * printing the shuffled list using for each construct
		 */
		for (String s : random) {
			System.out.format("%s", s);

		}

		Set<String> noDups = new HashSet<>();
		Set<String> dups = new HashSet<>();
		System.out.println();
		/**
		 * iterates the list
		 */
		for (String s : random) {
			/**
			 * adds the element to noDups if that element not present
			 * if it presents it returns false and negated as true and enters the if and stores it into dups
			 */
			if((!noDups.add(s))){
				dups.add(s);
			}
			/**
			 * removes the elements in common from noDups
			 */
			noDups.removeAll(dups);
			System.out.println(noDups.size() + " distinct words: " + noDups);
			System.out.println(dups.size() + " duplicate word :" + dups);
			System.out.println("------------------------------------------");
		}
		List<String> sorting = new LinkedList<>(Arrays.asList(Ran.stringArray));
		/**
		 * this method sorts as descending order ignoring the case
		 */
		Collections.sort(sorting,(o1,o2)->{return o2.compareToIgnoreCase(o1);}
		);
		System.out.println(sorting);
		/**
		 * this method sorts as ascending order ignoring the case
		 */
		Collections.sort(sorting,(s1,s2)->{return s1.compareToIgnoreCase(s2);}
		);

	}
}
