package assignment_5_YangZhang;

public class MyMap<K, V> {
    MyEntry<K, V>[] map;
    int capacity = 4;

    @SuppressWarnings("unchecked")
    public MyMap() {
        map = new MyEntry[capacity];
    }

    public void put(K key, V value) {
        if (key == null) { // does not allow to store null
            return;
        }
        int hashIndex = hash(key);
        if (map[hashIndex] == null) { // no any entry in this index
            map[hashIndex] = new MyEntry<K, V>(key, value, null);
        } else { // already has one or several entries in this index
            MyEntry<K, V> previous = null;
            MyEntry<K, V> current = map[hashIndex];

            while (current != null) {
                if (current.key.equals(key)) { // check if there are any duplicate keys
                    if (previous == null) { // equals first entry's key
                        current = new MyEntry<K, V>(key, value, current.next);
                    } else {
                        previous.next = new MyEntry<K, V>(key, value, current.next);
                    }
                }

                previous = current;
                current = current.next;
            }
            previous.next = new MyEntry<K, V>(key, value, null); // if no duplicates, add to the
                                                                 // end.
        }
    }

    public V get(K key) {
        int hashIndex = hash(key);
        if (map[hashIndex] == null) {   //if no key exists, return null
            return null;
        } else {
            MyEntry<K, V> current = map[hashIndex];
            while (current != null){
                if (current.key.equals(key)){
                    return current.value;
                }
                current = current.next;
            }
            return null;        //if no key exists, return null
        }
    }

    public int hash(K key) {
        return Math.abs(key.hashCode()) % 3;
    }

    public boolean remove(K key) {
        int hashIndex = hash(key);
        if (map[hashIndex] == null) {   //if no key exists, return null
            return false;
        } else {
            MyEntry<K, V> previous = null;
            MyEntry<K, V> current = map[hashIndex];
            
            while (current != null){
                if (current.key.equals(key)){
                    if (previous == null){
                        map[hashIndex] =  map[hashIndex].next;
                        return true;
                    } else {
                        previous.next = current.next;
                        return true;
                    }
                }
                previous = current;
                current = current.next;
            }
            return false;   
        }
  
    }

}
