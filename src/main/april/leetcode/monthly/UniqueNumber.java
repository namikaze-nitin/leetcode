package leetcode.monthly;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for one. 
 * Find that single one.
 * 
 * Note: 
 * 1) Your algorithm should have a linear runtime complexity. 
 * 2) Could you implement it without using extra memory?
 * @author weasel
 */
public class UniqueNumber {

	/**
	 * Solved using two for loops
	 * 
	 * @author weasel
	 *
	 */
	public class SolutionTwoFor {
	    public int singleNumber(int[] nums) {
	    	boolean duplicate  = false;
	    	int size = nums.length;	    	
	    	for(int i=0; i<size; i++) {
	    		duplicate = false;
	    		for(int j=0; j<size; j++) {
	    			System.out.println("comparing : i=" + nums[i] + ", j=" + nums[j]);
	    			if(nums[i]==nums[j] && i!=j) {
	    				duplicate=true;
	    			}
	    		}
	    		if(duplicate==false) return nums[i];
	    	}
	    	return 0;	    }
	}
	
	/**
	 * Using Hashing to solve this by using key as different nos and value as their count
	 * @author weasel
	 *
	 */
	public class SolutionMap {
	    public int singleNumber(int[] nums) {
	    	Map<Integer, Integer> numCountMapper =  new HashMap<>();
	    	for(int num : nums) {
	    		if(numCountMapper.get(num) == null)
	    			numCountMapper.put(num, 1);
	    		else
	    			numCountMapper.put(num, numCountMapper.get(num)+1);
	    	}
	    	for(int key : numCountMapper.keySet())
	    		if(numCountMapper.get(key)==1)
	    			return key;
	        return 0;
	    }
	}

	/**
	 * Using XOR
	 * Properties of XOR :
	 *	1) i XOR i = 0
	 *	2) i XOR 0 = i
	 * 
	 * @author weasel
	 *
	 */
	public class Solution {
	    public int singleNumber(int[] nums) {
	    	int result = 0;
	    	for(int num : nums)
	    		result ^=num;
	    	return result;
	    }
	}
}
