package leetcode.monthly;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number n is "happy".
 * A happy number is a number defined by the following process: 
 * Starting with any positive integer, replace the number by the sum of the squares of its digits, 
 * and repeat the process until the number equals 1 (where it will stay), or 
 * it loops endlessly in a cycle which does not include 1. 
 * 
 * Those numbers for which this process ends in 1 are happy numbers.
 * 
 * Return True if n is a happy number, and False if not.
 * @author weasel
 *
 */
public class HappyNumber {
	
	/**
	 * Basic Method using Set and Storing repetition of no in set
	 * 
	 * @param n
	 * @return
	 */
    public boolean isHappyUsingSetAndSplitList(int n) {

	        Set<Integer> hasValue = new HashSet<>();
	    	hasValue.add(n);
	        
	    	while(n!=1) {
	    		int num=0;
	        	while(n>0) {
	        		num += Math.pow(n%10, 2);
	        		n=n/10;
	        	}
	        	n=num;
	        	if(hasValue.contains(n) == true) return false;
	        	else hasValue.add(n);
	        }
	    	hasValue.clear();
	        return true;

    }
}
