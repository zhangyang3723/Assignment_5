package assignment_5_YangZhang;

public class MyEntry<K, V> {
    K key;
    V value;
    MyEntry<K, V> next;

    public MyEntry(K key, V value, MyEntry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

}
