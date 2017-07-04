internal interface BiMapKt<K, V> : Map<K, V> {
    fun inverse(): Map<V, K>
}

class SimpleBiMapKt<K,V>(val map: HashMap<K,V> = HashMap()) : BiMapKt<K,V>, MutableMap<K,V> by map {

    override fun put(key: K, value: V): V? {
        if(map.containsKey(key)) {
            throw IllegalArgumentException("Keys must be unique")
        }
        if(map.containsValue(value)) {
            throw IllegalArgumentException("Values must be unique")
        }
        return map.put(key, value)
    }

    override fun inverse(): Map<V, K> {
        return map.entries.map { (k,v) -> Pair(v,k) }.toMap()
    }

}