package co.nitin.practice.august;

/**
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * <br>
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * <ul>All letters in this word are capitals, like "USA".</ul>
 * <ul>All letters in this word are not capitals, like "leetcode".</ul>
 * <ul>Only the first letter in this word is capital, like "Google".</ul>
 * <br>Otherwise, we define that this word doesn't use capitals in a right way.
 *  
 * @author weasel
 *
 */
public class DetectCapital {
	
    public static boolean detectCapitalUse(String word) {
    	
    	int length = word.length();
		if(length==1) return true;

		System.out.println("Is Cap : " + Character.isUpperCase(word.charAt(0)));
		
		if(Character.isUpperCase(word.charAt(0))) {
			System.out.println("first cap : " + word);
			if(Character.isUpperCase(word.charAt(1))) {
				for(int i = 2; i < length; i++)
					if(Character.isLowerCase(word.charAt(i))) return false;
			} else {
				for(int i = 2; i < length; i++)
					if(Character.isUpperCase(word.charAt(i))) return false;	
			}
		}
		else {
			System.out.println("first small : " + word);
			for(int i = 1; i < length; i++)
				if(Character.isUpperCase(word.charAt(i))) return false;	
			
		}
    	return true;
    }
    
    public static void main(String...s) {
    	System.out.println("Is Valid word : " + DetectCapital.detectCapitalUse("USA"));
    	System.out.println("Is Valid word : " + DetectCapital.detectCapitalUse("Usa"));
    	System.out.println("Is Valid word : " + DetectCapital.detectCapitalUse("usa"));
    	System.out.println("Is Valid word : " + DetectCapital.detectCapitalUse("usA"));
    	System.out.println("Is Valid word : " + DetectCapital.detectCapitalUse("UsA"));
    	System.out.println("Is Valid word : " + DetectCapital.detectCapitalUse("uSA"));
    	System.out.println("Is Valid word : " + DetectCapital.detectCapitalUse("u"));
    	System.out.println("Is Valid word : " + DetectCapital.detectCapitalUse("A"));

    }
}
