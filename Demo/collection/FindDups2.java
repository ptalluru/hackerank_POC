package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDups2 {
    public static void main(String[] args) {
    	String[] args1 = {"i","came","i","saw","i","left",null};
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String a : args1)
            if (!uniques.add(a))
                dups.add(a);
        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
        List<String> demo = new ArrayList<>(java.util.Arrays.asList(args1));
        demo.set(0,"you");
        System.out.println(demo);
    }
}