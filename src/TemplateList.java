import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TemplateList<T> {
    private static int counter = 1; // When you create multiple customers you need a unique number. Static will
                                    // point to the same spot no matter how many customers you create.
/**
 * An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
 */
    private Map<Integer, T> itemLists = new HashMap<Integer, T>(); // Sets map interface to become a concrete object
/**
 * An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
 * @param item
 * @return
 */
    public T add(T item) {
        itemLists.put(counter++, item); //performs functions or methods on a type.
        return item;
    }
/**
 * This interface is typically used to pass collections around and manipulate them where maximum generality is desired.
 * @return
 */
    public Collection<T> listAll() { //A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not.
        return itemLists.values();
    }

}