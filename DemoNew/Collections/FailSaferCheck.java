package com.demo.cg.DemoNew.Collections;

import java.util.HashMap;
import java.util.Iterator;

public class FailSaferCheck {

	public static void main(String... args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("First", 10);
		map.put("Second", 20);
		map.put("Third", 30);
		map.put("Fourth", 40);
		System.out.println(map);
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key);
			iterator.remove();
			System.out.println(key);
		}
		System.out.println("after iterator removed "+map);
	}
}
