package betaben.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<String> wordList;
	
	public static void main(String[] args) {

		wordList = new ArrayList<String>();
		wordList.add("A");
		wordList.add("frog");
		wordList.add("is");
		
		//totalLetters(wordList);
		
		//basicGapWidth(wordList, 13);
		
		format(wordList, 13);
		
	}
	
	// Question A
	
	public static int totalLetters(List<String> wordList){
		int total = 0;
		for(String s : wordList){
			total += s.length();
		}
		System.out.println("Total letters:" + total);
		return total;
	}
	
	// Question B
	
	public static int basicGapWidth(List<String> wordList, int formattedLen){
		int gapWidth = 0;
		gapWidth = (formattedLen - totalLetters(wordList)) / wordList.size();
		System.out.println("Gap width:" + gapWidth);
		return gapWidth;
	}
	
	// Question C
	
	public static int leftoverSpaces(List<String> wordList, int formattedLen){
		int spaces = 0;
		spaces = formattedLen % basicGapWidth(wordList, formattedLen);
		return spaces;
	}
	
	public static String format(List<String> wordList, int formattedLen){
		String formattedString = "";
		for(String s : wordList){
			String b = s.substring(0);
			formattedString += b;
			for(int i = 0; i < basicGapWidth(wordList, formattedLen); i++){
				formattedString += " ";
			}
		}
		System.out.println(formattedString);
		return formattedString;
	}

}
