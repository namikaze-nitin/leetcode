package co.nitin.practice.august;

import java.util.regex.Pattern;

public class DetectCapital {
	
    public static boolean detectCapitalUse(String word) {
    	String regex = "[A-Z]+|[A-Za-z][a-z]*";
    	return Pattern.compile(regex).matcher(word).matches();
    }
    
    public static void main(String...s) {
    	System.out.println(DetectCapital.detectCapitalUse("USA"));
    	System.out.println(DetectCapital.detectCapitalUse("Usa"));
    	System.out.println(DetectCapital.detectCapitalUse("usa"));
    	System.out.println(DetectCapital.detectCapitalUse("usA"));
    	System.out.println(DetectCapital.detectCapitalUse("UsA"));
    	System.out.println(DetectCapital.detectCapitalUse("uSA"));
    	System.out.println(DetectCapital.detectCapitalUse("u"));
    	System.out.println(DetectCapital.detectCapitalUse("A"));

    }
}
