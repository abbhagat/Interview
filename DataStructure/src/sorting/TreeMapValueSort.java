package sorting;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class MapUtility {

	public static <K, V extends Comparable<V>> Map sortOnValues(Map<K, V> map) {
        Map<K, V> sortedMap = new TreeMap<>(new TreeMapComparator<>(map));
        sortedMap.putAll(map);
        return sortedMap;
    }
}

class TreeMapComparator<K, V extends Comparable<V>> implements Comparator<K> {
    Map<K, V> map;

    TreeMapComparator(Map<K, V> map) {
        this.map = map;
    }

    public int compare(K k1, K k2) {
        V v1 = map.get(k1);
        V v2 = map.get(k2);
        return v1.compareTo(v2);
    }
}

public class TreeMapValueSort {

	public static void main(String[] args) {
        Map<String, Integer> tm = new TreeMap<>();
        tm.put("A", 165);
        tm.put("Z", 290);
        tm.put("C", 367);
        System.out.println(MapUtility.sortOnValues(tm));
    }
}
