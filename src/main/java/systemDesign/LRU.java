package main.java.systemDesign;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public LRU(int capacity) {
        this.capacity = capacity;

        cache = new LinkedHashMap<>(capacity, 0.75f, true) {

            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRU.this.capacity;
            }
        };
    }

    public int get(int key){

        return cache.getOrDefault(key,-1);
    }

    public void put(int key, int value){
        cache.put(key,value);
    }

    public static void main(String[] args) {


        LRU cache = new LRU(18);
        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);

        System.out.println(cache.get(1)); // 10

        cache.put(4, 40);

        System.out.println(cache.get(2)); // -1 (evicted)

        System.out.println(cache.get(3)); // 30

        cache.put(5, 50);

        System.out.println(cache.get(1)); // -1

        System.out.println(cache.get(4)); // 40

        System.out.println(cache.get(5)); // 50

    }
}
