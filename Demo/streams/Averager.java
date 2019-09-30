package streams;

import java.util.function.IntConsumer;

class Averager implements IntConsumer
{
    private int total = 0;
    private int count = 0;
        
    public double average() {
        return count > 0 ? ((double) total)/count : 0;
    }
        
    public void accept(int i) { total += i; count++; }
    public void combine(Averager other) {
        total += other.total;
        count += other.count;
    }
}

/*
Exercise: Write the following enhanced for statement as a pipeline with lambda expressions. 
Hint: Use the filter intermediate operation and the forEach terminal operation. 
for (Person p : roster) {
    if (p.getGender() == Person.Sex.MALE) {
        System.out.println(p.getName());
    }
}

Ans:-
	roster
		.stream()
		.filter(p->p.getGender()==Person.Sex.MALE)
		.forEach(p->System.out.println(p.getName()));
*/
/*
Convert the following code into a new implementation that uses lambda expressions and 
aggregate operations instead of nested for loops. 
Hint: Make a pipeline that invokes the filter, sorted, and collect operations, in that order.

List<Album> favs = new ArrayList<>();
for (Album a : albums) {
    boolean hasFavorite = false;
    for (Track t : a.tracks) {
        if (t.rating >= 4) {
            hasFavorite = true;
            break;
        }
    }
    if (hasFavorite)
        favs.add(a);
}
Collections.sort(favs, new Comparator<Album>() {
                           public int compare(Album a1, Album a2) {
                               return a1.name.compareTo(a2.name);
                           }});
                           
Ans:-                           
 List<Album> sortedFavs =
 albums.stream()
       .filter(a -> a.tracks.anyMatch(t -> (t.rating >= 4)))
       .sorted(Comparator.comparing(a -> a.name))
       .collect(Collectors.toList());                        
*/
