/**
 * 
 * Exercise: The following exercises involve modifying the class DataStructure.java,
 *	which the section Inner Class Example discusses.
 *
 *	a)Define a method named print(DataStructureIterator iterator).
 	  Invoke this method with an instance of the class EvenIterator so that it performs the same function 
 	  as the method printEven.

			Hint: These statements do not compile if you specify them in the main method:

			DataStructure ds = new DataStructure();
			ds.print(new EvenIterator());
			The compiler generates the error message, "non-static variable this cannot be referenced from a 
			static context" when it encounters the expression new EvenIterator(). 
			The class EvenIterator is an inner, non-static class. This means that you can create an instance 
			of EvenIterator only inside an instance of the outer class, DataStructure.
			You can define a method in DataStructure that creates and returns a new instance of EvenIterator.
			
 *	b)Invoke the method print(DataStructureIterator iterator)
 	  so that it prints elements that have an odd index value. Use an anonymous class as the 
 	  method's argument instead of an instance of the interface DataStructureIterator.

			Hint: You cannot access the private members SIZE and arrayOfInts outside the class DataStructure,
			which means that you cannot access these private members from an anonymous class defined outside 
			DataStructure.
			You can define methods that access the private members SIZE and arrayOfInts and then use them
			in your anonymous class.
			
 *	c)Define a method named print(java.util.Function<Integer, Boolean> iterator) 
 	  that performs the same function as print(DataStructureIterator iterator). Invoke this method with a lambda 
 	  expression to print elements that have an even index value. 
 	  Invoke this method again with a lambda expression to print elements that have an odd index value.

			Hint: In this print method, you can step though the elements contained in the array arrayOfInts with
	 		a for expression. For each index value, invoke the method function.apply. If this method returns 
	 		a true value for a particular index value, print the element contained in that index value.

	T		o invoke this print method to print elements that have an even index value, you can specify a lambda 
			expression that implements the method Boolean Function.apply(Integer t). This lambda expression 
			takes one Integer argument (the index) and returns a Boolean value (Boolean.TRUE if the index value 
			is even, Boolean.FALSE otherwise).
			
 *	d)Define two methods so that these statements print elements that have an even index value and then 
      elements that have an odd index value:

			DataStructure ds = new DataStructure()
			// ...
			ds.print(DataStructure::isEvenIndex);
			ds.print(DataStructure::isOddIndex);
			Hint: Create two methods in the class DataStructure named isEvenIndex and isOddIndex that have 
			the same parameter list and return type as the abstract method Boolean 
			Function<Integer, Boolean>.apply(Integer t). This means that the methods take one 
			Integer argument (the index) and return a Boolean value.
 *
 */
public class DataStructureJava_8 {

    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructureJava_8() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public int size() {
        return SIZE;
    }
    
    public int get(int index) {
        return arrayOfInts[index];        
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { }
    
    private class EvenIterator implements DataStructureIterator {
        
        private int nextIndex = 0;
                
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }
    
    public DataStructureIterator getEvenIterator() {
        return new EvenIterator();
    }
    
    public void printEven() {
        DataStructureIterator iterator = getEvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    public void print(java.util.function.Function<Integer, Boolean> function) {
        for (int i = 0; i < SIZE; i++) {
            if (function.apply(i)) {
                System.out.print(arrayOfInts[i] + " ");
            }
        }
        System.out.println();
    }
    
    public static Boolean isEvenIndex(Integer index) {
        if (index % 2 == 0) return Boolean.TRUE;
        return Boolean.FALSE;
    }
    
    public static Boolean isOddIndex(Integer index) {
        if (index % 2 == 0) return Boolean.FALSE;
        return Boolean.TRUE;
    }

    public static void main(String s[]) {
        
        DataStructureJava_8 ds = new DataStructureJava_8();
        
        System.out.println("printEven()");
        ds.printEven();
        
        System.out.println("print(DataStructureIterator) with "    
            + "getEvenIterator");
        ds.print(ds.getEvenIterator());
        
        System.out.println("print(DataStructureIterator) with "
            + "anonymous class, odd indicies");
        ds.print(
            new DataStructureJava_8.DataStructureIterator() {
                private int nextIndex = 1;
                public boolean hasNext() {
                    return (nextIndex <= ds.size() - 1);
                }
                public Integer next() {
                    int retValue = ds.get(nextIndex);
                    nextIndex += 2;
                    return retValue;
                }
            }
        );
        
        System.out.println("print(Function) with lambda expressions");
        ds.print(index -> {
            if (index % 2 == 0) return Boolean.TRUE;
            return Boolean.FALSE;
        });
        ds.print(index -> {
            if (index % 2 == 0) return Boolean.FALSE;
            return Boolean.TRUE;
        });
        
        System.out.println("print(Function) with method references");
        ds.print(DataStructureJava_8::isEvenIndex);
        ds.print(DataStructureJava_8::isOddIndex);
    }
}