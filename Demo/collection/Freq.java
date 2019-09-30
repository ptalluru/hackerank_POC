package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Freq {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		String[] args1 = { "if", "it", "is", "to", "be", "it", "is", "up", "to", "me", "to", "delegate" };
		// Initialize frequency table from command line
		for (String a : args1) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.println(m.size() + " distinct words:");
		System.out.println(m);
	}
}