package co.nitin.practice.july;

/**
 * There are 8 prison cells in a row, and each cell is either occupied or vacant.
 * Each day, whether the cell is occupied or vacant changes according to the following rules:
 * 
 * 1) If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
 * 2) Otherwise, it becomes vacant.
 * 
 * (Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)
 * @author weasel
 *
 */
public class Prison {
	
	/**
	 * Normal solution using for loops resulting in time limit exceed for very large N
	 * @param cells
	 * @param N
	 * @return
	 */
    public static int[] prisonAfterNDays(int[] cells, int N) {
     
    	int size = cells.length;
    	
		int[] temp = new int[size];
		temp[0] = 0; temp[size-1] = 0; //since first and last dont hv adjacent nodes

		int j = 1;
		while(N>0) {
			
			for(int i=1 ; i < size-1 ; i++) {
				if((cells[i-1]==0 && cells[i+1]==0)	||	(cells[i-1]==1 && cells[i+1]==1))
					temp[i] = 1;
				else 
					temp[i] = 0;				
	    	}
			
			N--;
			System.out.print(j + " : ");
	        for (int i=0; i<size; i++) {
	        	cells[i] = temp[i];
	        	System.out.print(cells[i]+" ");
	        }
	        System.out.println();
	        j++;
		}
    	return cells;
    }
}
