package co.nitin.practice.august;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateArrayElement {

	//Using List nand Set
    public List<Integer> findDuplicates(int[] nums) {
     
    	Set<Integer> set = new HashSet<>();
    	List<Integer> list = new ArrayList<>();
    	for(int val : nums) 
    		if(!set.contains(val))
    			set.add(val);
    		else list.add(val);
    	return list;
    }

    public List<Integer> findDuplicatesUsingMap(int[] nums) {

    	Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    	ArrayList<Integer> list = new ArrayList<>();
    	for(int val : nums) {
    		if(map.get(val)==null)
    			map.put(val, true);
    		else list.add(val);
    	}

    	return list;
    }
}
