package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

interface Drawable {
	public void draw();
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		int width = 10;

		// without lambda, Drawable implementation using anonymous class
		Drawable d = () -> System.out.println("Drawing " + width);
		d.draw();
		LinkedList<String> alphabates =new LinkedList<String>();
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("a","b","c"));
		arr.forEach(alpha->{
			alphabates.add("alpha....."+alpha);
			System.out.println(alphabates);
		});
		System.out.println(arr);
	};
}
