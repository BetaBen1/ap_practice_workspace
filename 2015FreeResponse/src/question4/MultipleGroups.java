package question4;

import java.util.List;

public class MultipleGroups implements NumberGroup {

	private List<NumberGroup> groupList;
	
	@Override
	public boolean contains(int num) {
		for(NumberGroup group : groupList){
			if(groupList.contains(num)){
				return true;
			}	
		}
		return false;
	}

	
	
}
