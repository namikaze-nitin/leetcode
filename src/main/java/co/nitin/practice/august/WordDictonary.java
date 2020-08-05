package co.nitin.practice.august;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

class WordDictionary {

	private Set<String> dictionary;
	
    /** Initialize your data structure here. */
    public WordDictionary() {
    	this.dictionary = new HashSet<>();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        this.dictionary.add(word);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
    	Pattern p = Pattern.compile(word);
        return dictionary.stream().anyMatch(w -> p.matcher(w).matches());
    }

	public Set<String> getDictionary() {
		return dictionary;
	}

   public static void main(String...s) {
	   	 WordDictionary obj = new WordDictionary();
	   	 obj.addWord("bad");
	   	 System.out.println(obj.getDictionary());
	   	 obj.addWord("dad");
	   	 System.out.println(obj.getDictionary());
	   	 obj.addWord("mad");
	   	 System.out.println(obj.getDictionary());
	   	 System.out.println();   	 
	   	 System.out.println(obj.search("pad") + " : " + obj.search("bad") + " : " 
	   			 		+	obj.search(".ad") + " : " +	 obj.search("b.."));
	}

}

