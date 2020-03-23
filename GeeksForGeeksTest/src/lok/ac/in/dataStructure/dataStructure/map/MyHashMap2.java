package lok.ac.in.dataStructure.dataStructure.map;

import java.util.IllegalFormatException;

/**
 * Created by Lokesh Sharma on 25-05-2019.
 */
public class MyHashMap2<K,V> {
    private int DEFAULT_BUCKET_COUNT = 10;
    private Entry<K,V> [] bucket;

    public MyHashMap2(){
        bucket = new Entry[DEFAULT_BUCKET_COUNT];
    }

    public void put(K k, V v){
        int index = keyHashCodeIndex(k);

        Entry<K,V> entry = bucket[index];

        boolean done = false;

        if(entry == null){
            bucket[index] = new Entry<K, V>(k,v);
            return;
        }

        while (!done){
            if(entry.getKey().equals(k)){
                entry.setValue(v);
                done=true;
            }else if(entry.getNext() == null){
                entry.setNext( new Entry<K, V>(k,v));
                done = true;
            }

            entry = entry.getNext();
        }
    }

    public V getValue(K k){

        int index = keyHashCodeIndex(k);

        Entry<K,V> entry = bucket[index];

        if(entry == null){
            return null;
        }

        while (entry!=null){
            if(entry.getKey().equals(k)){
                return entry.getValue();
            }
            entry = entry.getNext();
        }

        return null;
    }

    public int keyHashCodeIndex(K key){
        return key.hashCode()%bucket.length;
    }

    public void throwException(){
        throw new NullPointerException("Key is not valid");
    }
}

class Entry2<K,V>{
    private Entry2<K,V> next = null;

    private K key;

    private V value;

    public Entry2(K key, V value){
        this.key = key;
        this.value = value;
    }

    public Entry2<K, V> getNext() {
        return next;
    }

    public void setNext(Entry2<K, V> next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


class Test2{
    public static void main(String[] args) {
        MyHashMap2<Integer,String> hashMap2 = new MyHashMap2<>();

        hashMap2.put(1,"a");

        hashMap2.put(11,"b");

        System.out.println(hashMap2.getValue(1));
    }
}



