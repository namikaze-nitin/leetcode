package leetcode.monthly;

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

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
     
    	List<List<Integer>> levelOrderList = new ArrayList<>();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	
    	while(!queue.isEmpty()) {
    		
    		ArrayList<Integer> levelVal = new ArrayList<>();
    		ArrayList<TreeNode> levelNode = new ArrayList<>();
    		while(!queue.isEmpty()){
    			TreeNode tempNode  = queue.poll();
    			levelVal.add(tempNode.getVal());
    			levelNode.add(tempNode);
    		}
    		queue.addAll(levelNode);
    		levelOrderList.add(levelVal);
    	}
    	
    	return levelOrderList;
    }
    
    public static void main(String...s) {
    	TreeNode three = new TreeNode();
    	TreeNode nine = new TreeNode();
    	TreeNode seven = new TreeNode();
    	TreeNode twenty = new TreeNode();
    	TreeNode fifteen = new TreeNode();
    	
    	twenty.setRight(seven);
    	twenty.setLeft(fifteen);
    	three.setLeft(nine);
    	three.setRight(twenty);
    	
    	System.out.println(levelOrderBottom(three).size());;
    }
}
