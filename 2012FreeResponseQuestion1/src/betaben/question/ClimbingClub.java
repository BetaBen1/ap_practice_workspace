package betaben.question;

import java.util.ArrayList;
import java.util.Collections;
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
	
//	public void addClimb(String peakName, int climbTime){
//		climbList.add(new ClimbInfo(peakName, climbTime));
//		if(climbList.size() > 0){
//			for(ClimbInfo i : climbList){
//				if(climbList.indexOf(i)>0){
//					if(i.getName().compareTo(climbList.get(climbList.indexOf(i)-1).getName()) > 0){
//						Collections.rotate(climbList.subList(climbList.indexOf(i), climbList.indexOf(i)+1), -1);
//					}
//				}
//			}
//		}	
//	}
	
	public void addClimb(String peakName, int climbTime){
		for(ClimbInfo i : climbList){
			
		}
		climbList.add(new ClimbInfo(peakName, climbTime));
	}

	public static void print(){
		for(int i = 0; i<climbList.size(); i++){
			System.out.println(climbList.get(i).getName());
		}
	}
	
	// C
	
//	public int distinctPeakNames(){
//		
//	}
	
}
