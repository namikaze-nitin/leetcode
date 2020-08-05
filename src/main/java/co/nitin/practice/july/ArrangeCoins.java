package co.nitin.practice.july;

/**
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
 * Given n, find the total number of full staircase rows that can be formed.
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 */
public class ArrangeCoins {

	static int j = 0;

	/**
	 * simple solution using while loops
	 * @param n
	 * @return
	 */
	public static int arrangeCoins(int n) {
    	int j=0;
    	while(n>0) {
    		j++;
    		n=n-j;
    	}
    	return (n<0)?j-1:j;
    }
    
	/**
	 * Using mathematical formulae
	 * @param n
	 * @return
	 */
	public static int arrangeRecCoins(int n) {
		//Approximate k value
		long k = (long)Math.sqrt(2*(long)n);
		//sum using this k value
		long sum = k*(k+1)/2;
        //calculate on basis of actual n and sum using assumed k 
        if(sum>n)
    		return (int)k-1;
		else 
	    	return (int)k;	
    }
	
	public static int fastest(int n) {
        //formuls  derived from k(k=1)<=2n
        return (int)(Math.sqrt(2 * (long)n + (float)1/4) - (float)1/2);
	}
	
    public static void main(String...s) {
    	System.out.println(fastest(5));
    	System.out.println(fastest(8));
    }
}
