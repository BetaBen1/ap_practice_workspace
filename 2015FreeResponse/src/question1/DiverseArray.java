package question1;

public class DiverseArray {

	public static int arraySum(int[] array){
		int sum = 0;
		for(int i = 0; i<array.length; i++){
			sum+=array[i];
		}
		System.out.println(sum);
		return sum;
	}
	
	public static int[] rowSums(int[][] array){
		
		int[] rowSums = new int[array.length];
		
		for(int c = 0;c<array.length; c++){
			int sum = 0;
			for(int r = 0;r<array[c].length; r++){
				sum+=array[c][r];
			}
			rowSums[c]=sum;
		}
		for(int i : rowSums){
			System.out.println(i + ", ");
		}
		return rowSums;
	}
	
	public static boolean isDiverse(int[][] array){
		int[] thisArray = rowSums(array);
		for(int i = 0; ))
		
	}
	
}
