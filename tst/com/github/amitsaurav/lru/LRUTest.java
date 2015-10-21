package com.github.amitsaurav.lru;

import org.junit.Test;

public class LRUTest {
    @Test
    public void test() {
        LRU<Integer, Integer> lru = new LRU<>(5);
        
        lru.add(1, 1);
        lru.add(2, 2);
        lru.add(3, 3);
        lru.add(4, 4);
        lru.add(5, 5);
        
        lru.printAll();
        
        lru.get(3);
        lru.printAll();
        
        lru.add(6, 6);
        lru.get(1);
        
        lru.printAll();
    }
}
