package OLD.Collections.Arraylist;

import java.util.Comparator;

/**
 * Created by PRudrawar on 12/24/2017.
 */
public class RatingComparator implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone obj1, SmartPhone obj2) {
        return (obj1.rating<obj2.rating) ? -1 : (obj1.rating>obj2.rating) ? 1 : 0;
    }
}
