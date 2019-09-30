import java.util.List;

public class PipelinesStreams {
	public static void main(String... args) {

		Animal animal = new Animal();
		List<Animal> animalList = animal.getAnimalList();

		
		  System.out.println("**** using regular for loop:"); for (Animal a :
		  animalList) { System.out.println(a.getName() + " " + a.getType()); }
		  
		  System.out.println("**** iteration using stream forEach:");
		  animalList.stream().forEach(a -> System.out.println(a.getName() + " " +
		  a.getType()));
		  
		  System.out.println("**** stream with filter:"); animalList.stream().filter(a
		  -> a.getType() == Animal.WILD).forEach(a -> System.out.println(a.getName() +
		  " " + a.getType()));
		  
		  System.out.println("**** stream with filter and count:"); long count =
		  animalList.stream().filter(a -> a.getType() == Animal.DOMESTIC).count();
		  System.out.println("Count of " + Animal.DOMESTIC + " animals: " + count);
		  long count1 = animalList.stream().filter(a -> a.getType() ==
		  Animal.WILD).count(); System.out.println("Count1 of " + Animal.WILD +
		  " animals: " + count1);
		 

		System.out.println("**** stream with filters and average on a property:");
		double averageAge = animalList.stream().filter(a -> a.getType() == Animal.WILD).filter(a -> a.getAge() > 2).mapToInt(Animal::getAge).average().getAsDouble();
		System.out.println("Average age of " + Animal.WILD + " animals: " + averageAge);

	}
}