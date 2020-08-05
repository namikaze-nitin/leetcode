package co.nitin.practice.april;

/**
 * Given an array nums, write a function to move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements.
 * @author weasel
 *
 */
public class ShiftZero {

	/**
	 * Using additional space for new array
	 * 
	 * @param nums
	 */
    public static void moveZeroes(int[] nums) {

    	int countZeroes = 0;
    	// int size = nums.length;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i]==0) countZeroes++;
    		else nums[i-countZeroes] = nums[i];
    	}

        for(int i = nums.length-countZeroes ; i < nums.length ; i++) 
            nums[i] = 0;
    }
}
