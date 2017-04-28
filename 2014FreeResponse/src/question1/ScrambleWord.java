package question1;

import java.util.List;
import java.util.ArrayList;

public class ScrambleWord {

	public static String scrambleWord(String word){
		ArrayList<Character> chars = new ArrayList<Character>();
		for(int i = 0; i<word.length(); i++){
			chars.add(word.charAt(i));
		}
		for(int i = 0; i<chars.size(); i++){
			if(chars.get(i) == 'A' && i !=chars.size()-1){
				if(chars.get(i+1) != 'A'){
					char temp = chars.get(i+1);
					chars.remove(i+1);
					chars.add(i, temp);
					i++;
				}
			}
		}
		String result = "";
		for(char c : chars){
			result += String.valueOf(c);
		}
//		System.out.println(result);
		return result;
		
	}
	
	public static void scrambleOrRemove(List<String> wordList){
		for(int i = 0; i<wordList.size(); i++){
			String temp = wordList.get(i);
			wordList.set(i, scrambleWord(wordList.get(i)));
			if(temp == wordList.get(i)){
				wordList.remove(i);
			}
		}
	}
	
}
