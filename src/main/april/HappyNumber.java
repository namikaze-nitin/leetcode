package main.april;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
    	
    	Set<Integer> hasValue = new HashSet<>();
    	hasValue.add(n);    	
    	ArrayList<Integer> list = new ArrayList<>();
        
    	while(n!=1) {
    		System.out.println("\n\n n : " + n);
        	while(n>0) {
        		list.add(n%10);
        		n=n/10;
        	}
        	
        	System.out.println("split : " + list);
        	
        	for(int val : list) n = n + val*val;
        	
        	if(hasValue.contains(n) == true)
        		return false;
        	else {
        		hasValue.add(n);
        		list.clear();
        	}
        }
        return true;
    }
}
