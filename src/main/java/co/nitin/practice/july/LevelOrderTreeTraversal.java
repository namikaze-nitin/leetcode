package co.nitin.practice.july;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, 
 * level by level from leaf to root).
 * @author weasel
 *
 */
public class LevelOrderTreeTraversal {
     
    public List<List<Integer>> levelOrderBottom(TreeNodes root) {
        
    	List<List<Integer>> levelOrderList = new ArrayList<>();
        if(root==null) return levelOrderList;
    	Queue<TreeNodes> queue = new LinkedList<TreeNodes>();
    	queue.add(root);
    	
    	while(!queue.isEmpty()) {
    		ArrayList<Integer> levelVal = new ArrayList<>();
    		ArrayList<TreeNodes> levelNode = new ArrayList<>();
    		
    		while(!queue.isEmpty()){
    			TreeNodes tempNode  = queue.poll();
    			levelVal.add(tempNode.val);
    			if(tempNode.left!=null)levelNode.add(tempNode.left);
    			if(tempNode.right!=null)levelNode.add(tempNode.right);
    		}
    		
    		queue.addAll(levelNode);
    		
    		levelOrderList.add(levelVal);
    	}
        
    	List<List<Integer>> finalOrderList = new ArrayList<>();
    	int size = levelOrderList.size();
    	for(int i=0; i<size; i++)
    		finalOrderList.add(levelOrderList.get(size-i-1));
    	    	
    	return finalOrderList;
    }
}
