package question4;

public class Range implements NumberGroup {

	private int min;
	private int max;
	
	public Range(int min, int max){
		this.min = min;
		this.max = max;
//		for(int i = min; i<max+1; i++){
//			System.out.println(i);
//		}
	}
	
	@Override
	public boolean contains(int num) {
		return num >= min && num <= max;
	}

}
