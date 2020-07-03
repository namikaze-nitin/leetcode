package leetcode.monthly;

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
	
    public int[] prisonAfterNDays(int[] cells, int N) {
     
    	int size = cells.length;
    	
		int[] temp = new int[size];
		temp[0] = 0; temp[size-1] = 0; //since first and last dont hv adjacent nodes

		while(N>0) {
			for(int i=1 ; i < size-1 ; i++) {
				if((cells[i-1]==0 && cells[i+1]==0)	||	(cells[i-1]==1 && cells[i+1]==1))
					temp[i] = 1;
				else 
					temp[i] = 0;
				
				if(i>1) //copy temp array into cells for next stage
					cells[i-2] = temp[i-2];
	    	}
			N--;
			
			
//	        for (int i=0; i<size; i++) //or use iteration
//	        	cells[i] = temp[i]; 
			
		}
    	return cells;
    }
}
