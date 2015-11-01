package assignment_5_YangZhang;

import java.util.HashMap;

/*
 *  Assume pattern contains only lowercase letters
 *  and str contains lowercase letters separated by a single space
 */
public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		HashMap<Character, String> map = new HashMap<Character, String>();
		char[] patternChar = pattern.toCharArray();
		String[] patternString = str.split(" ");
		if (patternChar.length != patternString.length){
			//System.out.println("not the same length");
			return false;
		}
		
		for(int i = 0; i < patternChar.length; i++){
			if(map.containsKey(patternChar[i])){
				if(!map.get(patternChar[i]).equals(patternString[i])){
					//System.out.println(patternChar[i]+" not the same with "+patternString[i]);
					return false;
				}
				
//				if(map.get(patternChar[i]) != patternString[i]){
//					System.out.println(patternChar[i]+" not the same with "+patternString[i]);
//					return false;
//				}
			}else{
				map.put(patternChar[i], patternString[i]);
			}		
		}
		return true;
	}
	
	public static void main(String[] args) {
	    WordPattern test = new WordPattern();
		boolean b = test.wordPattern("abba","dog cat cat dog");
		System.out.println(b);

	}
}
