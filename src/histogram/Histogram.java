package histogram;

import java.util.HashMap;

/**
 *
 * @author callmebigpoppa22
 */
public class Histogram<Type> extends HashMap<Type, Integer> {

    @Override
    public Integer get(Object key) {
        if (containsKey(key)) {
            return super.get(key);
        }
        return 0;
    }
}
