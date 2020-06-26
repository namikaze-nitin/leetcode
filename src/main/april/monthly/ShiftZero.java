package monthly;

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
    public void moveZeroes(int[] nums) {
        int[] tempNum = new int[nums.length];
        int i = 0;
        for(int val : nums)
    	   if(val!=0) {
               System.out.println(val);
    		   tempNum[i] = val;
    		   i++;
    	   }
       
        while(i<nums.length) {
    	   tempNum[i]=0;
    	   i++;
        }
        
        nums = tempNum;
       System.out.println(tempNum);
    }

}
