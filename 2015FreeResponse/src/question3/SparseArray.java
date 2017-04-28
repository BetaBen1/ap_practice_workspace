package question3;

import java.util.ArrayList;
import java.util.List;

public class SparseArray {

	private int numRows;
	private int numCols;
	
	private List<SparseArrayEntry> entries;
	
	public SparseArray(){
		entries = new ArrayList<SparseArrayEntry>();
	}
	
	public int getNumRows(){
		return numRows;
	}
	
	public int getnumCols(){
		return numCols;
	}
	
	public int getValueAt(int row, int col){
		for(SparseArrayEntry entry : entries){
			if(entry.getRow() == row & entry.getCol() == col){
				return getValueAt(row, col);
			}
		}
		return 0;
	}
	
	public void removeColumn(int col){
		for(SparseArrayEntry entry : entries){
			if(entry.getCol() == col){
				
			}
			for(int c = col; c<entry.getCol(); c++){
				if(c>col){
					
				}
			}
		}
		numCols -=1;
	}
	
}
