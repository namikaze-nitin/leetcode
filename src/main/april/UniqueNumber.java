package main.april;

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
	
	public class SolutionMap {
	    public int singleNumber(int[] nums) {
	        return 0;
	    }
	}

	public class Solution {
	    public int singleNumber(int[] nums) {
	        return 0;
	    }
	}
}
