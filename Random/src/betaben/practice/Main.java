package betaben.practice;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.NumberUpSupported;

public class Main {

	public static void main(String[] args) {

		// Example of ArrayList functions //
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//	    numbers.add(1);
//	    numbers.add(2);
//	    numbers.add(3);
//	    numbers.add(4);
//	    numbers.set(2, numbers.remove(1));
//	    System.out.println(numbers);
		
//		System.out.println(isSuch(100));
	
//		int x = 5, y = 2;
//		System.out.println(x/y - (double)(x/y));
//		// Prints: "0.0" //
		
//		int x = 5;
//		double y = 5;
//		System.out.println(y-x);
//		// Prints: "0.0" //
		
//		int i = Integer.MAX_VALUE;
//		i++;
//		System.out.println(i);
//		// Prints: "-2147483648" //
		
//		int i = 0, n = 100;
//		for(i++; i<n; n--){
//			i++;
//		}
//		System.out.println(i);
//		// Prints: "51" //
		
//		int i = 0;
//		i+=5;
//		for(int j = 50; i<j; j--){
//			i++;
//		}
//		i+=j;
//		System.out.println(i);
//		// Code does not compile due to a reference to j outside the for loop. //
		
//		int i = 0;
//		for(i = 0; i<"You are doing great!".length(); i+=2){
//			System.out.println("Good luck on the test.");
//		}
//		System.out.println(i);
//		// Prints: "Good luck on the test." nine times and "20" one time. //
		
//		int i = 0;
//		int sum = 0;
//		for(i = 0; i<"You are doing great!".length(); i+=3){
//			sum+=i;
//		}
//		System.out.println(i);
//		// Prints: "21" //
		
//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
//		for(int k = 3; k < arr.length - 1; k++){
//			arr[k-1] = arr[k+1];
//		}
//		
//		for(int i : arr){
//			System.out.println(i);
//		}
//		// Prints: 1 2 5 6 7 6 7 //
		
//		int a = 0,c = 0,t = 0,g = 0;
//		String dna = "AACTtTTGGACGGCTG";
//		for (int i = 0; i < dna.length(); i++){
//	  	if (dna.substring(i,i+1).equals("A")){
//	  		    a++;
//	  	}
//	  	if (dna.substring(i,i+1).equals("C")){
//	  		    c++;
//	  	}
//	  	if (dna.substring(i,i+1).equals("T")){
//	  		    t++;
//	  	}
//	  	if (dna.substring(i,i+1).equals("G")){
//	  		    g++;
//	  	}}
//	  	System.out.println(a + " " + c +" " + t + "  + g ");
//		// Prints: "3 3 4 + g" //
		
//		int a = 0,c = 0,t = 0,g = 0;
//	  	String dna = "AACTtTTGGACGGCTG";
//	  	for (int i = 0; i < dna.length(); i++){
//	  	if (dna.substring(i,i+1).toUpperCase().equals("A")){
//	  		    a++;
//	  	}
//	  	if (dna.substring(i,i+1).toUpperCase().equals("C")){
//	  		    c++;
//	  	}
//	  	if (dna.substring(i,i+1).toUpperCase().equals("T")){
//	  		    t++;
//	  	}
//	  	if (dna.substring(i,i+1).toUpperCase().equals("G")){
//	  		    g++;
//	  	}}
//	  	System.out.println(a + "-" + c +"-" + t + "-" + g );
//		// Prints: "3-3-5-5" //
		
//		List<String> cities = new ArrayList<String>();
//		cities.add("Atlanta");
//		cities.add("Boston");
//
//		for (int i = 1; i < cities.size(); i++)
//			cities.add(i, "+");
//
//		System.out.println(cities);
//		//Prints: Nothing because it enters an endless loop. //
		
//		System.out.println("2" + "/" + "3");
//		System.out.println(2/3);
//		System.out.println(2 + "/" + 3);
//		System.out.println((int)2 + "/" + (int)3);

//		int[] counts = new int[3];
//	    for (int i = 0; i < 100; i++)
//	      for (int j = 0; j < 10; j++)
//	        counts[j % 3]++;
//	     System.out.println((counts[1] + counts[2]) / counts[0]);
		
//		List<Integer> nums = new ArrayList<Integer>();
//		nums.add(0);
//		nums.add(0);
//		nums.add(4);
//		nums.add(2);
//		nums.add(5);
//		nums.add(0);
//		nums.add(3);
//		nums.add(0);
//		for(int k = 0; k<nums.size();k++){
//			if(nums.get(k).intValue() == 0){
//				nums.remove(k);
//			}
//		}
//		for(int i : nums){
//			System.out.println(i);
//		}
		
	}
	
//	public static boolean isSuch(int n){
//		return n > 2 && !isSuch(n-2);
//	}

}
