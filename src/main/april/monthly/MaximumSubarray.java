package monthly;

/**
 * Find max sum.
 * 
 * {i-1th max sum to ith Max sum} : variable between these two sums positions make max sum
 * @author weasel
 *
 */
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
    	
        int max=nums[0];
        int sum=nums[0];
        int beg=0, end=0;
        
        for(int i=1; i<nums.length; i++) {
        	if(nums[i]>sum+nums[i]) {
        		sum=nums[i];
        		beg=i;
        	} else 
        		sum = sum + nums[i];
            
            if(sum>max) {
                max=sum;
                end = i;
      		}
            
            System.out.print("Start : " + beg);
            System.out.print("End : " + end);

        }
        return max;
    }
}