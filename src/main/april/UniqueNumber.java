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
	    	
	    	return 0;
	    }
	}
	
	public class SolutionMap {
	    public int singleNumber(int[] nums) {
	        int[] count = new int[nums.length];
	        for(int val : nums)
	            count[val] = count[val] + 1;
	        for(int i=0; i<count.length; i++)
	            if(count[i]==1)
	                return i;
	        return 0;
	    }
	}

	public class Solution {
	    public int singleNumber(int[] nums) {
	        int[] count = new int[nums.length];
	        for(int val : nums)
	            count[val] = count[val] + 1;
	        for(int i=0; i<count.length; i++)
	            if(count[i]==1)
	                return i;
	        return 0;
	    }
	}
}
