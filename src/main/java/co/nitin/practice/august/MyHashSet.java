package co.nitin.practice.august;

import java.util.HashMap;

class MyHashSet {

	private HashMap<Integer, Boolean> map;
	
    /** Initialize your data structure here. */
    public MyHashSet() {
        map = new HashMap<>();
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
