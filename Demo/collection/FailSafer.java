package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailSafer {
	String[] nums = {"1","2","5","9","7","3","4","8","6"};
	List<String> numbers = new ArrayList<String>(Arrays.asList(nums));
	Iterator<String> iterator = numbers.iterator();
}
