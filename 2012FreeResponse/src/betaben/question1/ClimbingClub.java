package betaben.question1;

import java.util.ArrayList;
import java.util.List;

public class ClimbingClub {

	private static List<ClimbInfo> climbList;
	
	public ClimbingClub(){
		climbList = new ArrayList<>();
	}
	
	// A
	
//	public void addClimb(String peakName, int climbTime){
//		climbList.add(new ClimbInfo(peakName, climbTime));
//	}
	
	// B
	
	
	public void addClimb(String peakName, int climbTime){
		
		int index = 0;
		
		if(climbList.size() > 0){
			for(ClimbInfo i : climbList)
				if(i.getName().compareTo(peakName) < 0)
					index++;
				
			climbList.add(index, new ClimbInfo(peakName, climbTime));
		}
		else 
			climbList.add(new ClimbInfo(peakName, climbTime));
		
		
	}

	public static void print(){
		for(ClimbInfo i : climbList){
			System.out.println(i.getName() + ":" + i.getTime());
		}
		System.out.println("------------");
	}
	
	// C
	
	public static int distinctPeakNames(){
		if(climbList.size() == 0){
			return 0;
		}
		ClimbInfo currInfo = climbList.get(0);
		String prevName = currInfo.getName();
		String currName = null;
		int numNames = 1;
		
		for (int k = 1; k < climbList.size(); k++){
			currInfo = climbList.get(k);
			currName = currInfo.getName();
			if(prevName.compareTo(currName) != 0){
				numNames++;
				prevName = currName;
			}
		}
		return numNames;
	}
	
}
