package Java_Collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionProgram {

    public static void main(String[] args) {

        Collection<String> animeCollection = new ArrayList<>();

        //To add into the collection use .add() api
        animeCollection.add("One Piece");
        animeCollection.add("Naruto");
        animeCollection.add("One Punch Man");
        animeCollection.add("Dragon Ball-Z");
        System.out.println(animeCollection);

        //To remove into the collection use .remove() api
        animeCollection.remove("Naruto");
        System.out.println(animeCollection);

        //To check for element in the list is present use .contains()
        System.out.println(animeCollection.contains("Naruto"));

        //Using forEach() loop
        animeCollection.forEach(element -> {
            System.out.println(element);
        });

       //using .clear() to clear data from list of collection
        animeCollection.clear();
        System.out.println(animeCollection);
    }
}
