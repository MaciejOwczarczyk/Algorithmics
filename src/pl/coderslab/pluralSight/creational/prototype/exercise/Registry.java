package pl.coderslab.pluralSight.creational.prototype.exercise;


import java.util.HashMap;
import java.util.Map;

public class Registry {

    private final Map<String, Item> items = new HashMap<String, Item>();

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    public Registry() {
        loadItems();
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("first");
        movie.setPrice(30.92);
        movie.setRuntime("2 hours");
        items.put("Movie" , movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(12.34);
        book.setTitle("basic book");
        items.put("Book", book);
    }
}
