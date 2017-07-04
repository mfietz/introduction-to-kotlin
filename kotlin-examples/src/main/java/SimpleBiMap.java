import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toMap;

public class SimpleBiMap<K,V> extends HashMap<K,V> implements BiMap<K,V> {

    public SimpleBiMap() { super(); }

    public SimpleBiMap(Map<K, V> collect) { super(collect); }

    @Override
    public V put(K key, V value) {
        if(keySet().contains(key)) {
            throw new IllegalArgumentException("Keys must be unique");
        }
        if(values().contains(value)) {
            throw new IllegalArgumentException("Values must be unique");
        }
        return super.put(key, value);
    }


    @Override
    public Map<V, K> inverse() {
        Map<V, K> inversed = entrySet().stream().collect(toMap(Entry::getValue, Entry::getKey));
        return new SimpleBiMap<>(inversed);
    }

}