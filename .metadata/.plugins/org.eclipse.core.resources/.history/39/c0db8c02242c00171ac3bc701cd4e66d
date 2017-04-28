package question2;

import java.util.List;

public class SeatingChart {
	
	public Student[][] seats;
	
	public SeatingChart(List<Student> studentList, int rows, int cols){
		seats = new Student[rows][cols];
		for(int c = 0; c<cols; c++){
			for(int r = 0; r<rows; r++){
				if((c*rows)+r < studentList.size()){
					seats[r][c] = studentList.get((c*rows)+r);
				}
			}
		}
		for(int c = 0; c<cols; c++){
			for(int r = 0; r<rows; r++){
				if((c*rows) + r < studentList.size()){
					System.out.print(seats[r][c].getName() + " ");
				} else {
					System.out.print("Null");
				}
				
			}
			System.out.println();
		}
	}

}
