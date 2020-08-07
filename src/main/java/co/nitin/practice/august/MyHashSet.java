package co.nitin.practice.august;

import java.util.HashMap;
import java.util.Map;

class MyHashSet {

	private Map<Integer, Boolean> map;
	
    /** Initialize your data structure here. */
    public MyHashSet() {
        map = new HashMap<Integer, Boolean>(1000, 1);
    }
    
    public void add(int key) {
        this.map.put(key, true);
    }
    
    public void remove(int key) {
        this.map.remove(key);
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return this.map.keySet().contains(key);
    }
}
