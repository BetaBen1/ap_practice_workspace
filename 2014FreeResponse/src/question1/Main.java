package question1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		new ScrambleWord().scrambleWord("ABRACADABRA");
		List<String> words = new ArrayList<String>();
		words.add("TAN");
		words.add("ABRACADABRA");
		words.add("WHOA");
		words.add("APPLE");
		words.add("EGGS");
		new ScrambleWord().scrambleOrRemove(words);
		for(String w : words){
			System.out.println(w);
		}
	}

}
