package co.nitin.practice.august;

import java.util.HashMap;
import java.util.Map;

/**
 * We dont know how many 
 * @author weasel
 *
 */
class WordDictionary {
	private TrieNode root;

	/** Initialize your data structure here. */
    public WordDictionary() {
    	this.root = new TrieNode('0', new HashMap<>(), false);
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
    	System.out.println("Word coming in : " + word);
    	char[] seq = word.toCharArray();
    	TrieNode temp = root;
    	int i = 0;

    	if(temp.getChild().keySet().contains(seq[0])) {
	    	temp = temp.getChild().get(seq[0]);
	    	System.out.println("isequal : " + (temp.getVal()==seq[i]));
    		while(temp.getVal()==seq[i]) {
        		System.out.println("same next element : " + seq[i] + " with i = " + i);
    			System.out.println(temp.getVal());
    			i++;
	    		if(temp.getChild().keySet().contains(seq[i]))
	    			temp = temp.getChild().get(seq[i]);
	    		else 
	    			break;
	    	}
    	}
    	if(i<seq.length-2) {
    		while(i<seq.length-1) {
        		System.out.println("next element : " + seq[i]);
    			TrieNode node = new TrieNode(seq[i], new HashMap<>(), false);
    			System.out.println("Entering node : " + node);
    			temp.getChild().put(seq[i], node);
    			temp=node;
        		i++;
    		}
    	}
    	//for last node
		System.out.println("final element : " + seq[i] + " with i = " + i);
		TrieNode node = new TrieNode(seq[i], new HashMap<>(), true);
		temp.getChild().put(seq[i], node);
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return dfsSearch(root.getChild(), word, 0);    
    }
    
    public boolean dfsSearch(Map<Character, TrieNode> children, String word, int start) {
        if(start == word.length()){
            if(children.size()==0) 
                return true; 
            else
                return false;
        }
 
        char c = word.charAt(start);    
        if(children.containsKey(c)){
            if(start == word.length()-1 && children.get(c).getIsLeaf()){
                return true;
            }
 
            return dfsSearch(children.get(c).getChild(), word, start+1);
        }else if(c == '.'){
            boolean result = false;
            for(Map.Entry<Character, TrieNode> child: children.entrySet()){
                if(start == word.length()-1 && child.getValue().getIsLeaf()){
                    return true;
                } 
 
                //if any path is true, set result to be true; 
                if(dfsSearch(child.getValue().getChild(), word, start+1)){
                    result = true;
                }
            }
 
            return result;
        }else{
            return false;
        }
    }
    
    public static void main(String...s) {
    	
    	WordDictionary obj = new WordDictionary();
    	obj.addWord("WordDictionary");
		System.out.println(obj.root.toString());
    	obj.addWord("addWord");
		System.out.println(obj.root.toString());
    	obj.addWord("search");
		System.out.println(obj.root.toString());
		
		System.out.println(obj.search("a."));
    }
}

/**
 * > val = node value
 * > Each mode has multiple kids, each having char value
 * > Use HashMap to store char and its node chain
 * 
 * @author weasel
 *
 */
class TrieNode{
	
	private Character val;
	private HashMap<Character, TrieNode> child;
	private Boolean isLeaf;
	
	public TrieNode(Character val, HashMap<Character, TrieNode> child, Boolean isLeaf) {
		super();
		this.val = val;
		this.child = child;
		this.isLeaf = isLeaf;
	}

	public Character getVal() {
		return val;
	}

	public Map<Character, TrieNode> getChild() {
		return (this.child);
	}

	public Boolean getIsLeaf() {
		return isLeaf;
	}

	@Override
	public String toString() {
		return "TrieNode [child=" + child + ", isLeaf=" + isLeaf + "]";
	}
}