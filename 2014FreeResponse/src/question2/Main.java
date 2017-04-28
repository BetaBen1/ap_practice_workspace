package question2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int rows = 4;
		int cols = 3;
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Karen"));
		studentList.add(new Student("Liz"));
		studentList.add(new Student("Paul"));
		studentList.add(new Student("Lester"));
		studentList.add(new Student("Henry"));
		studentList.add(new Student("Renee"));
		studentList.add(new Student("Glen"));
		studentList.add(new Student("Fran"));
		studentList.add(new Student("David"));
		studentList.add(new Student("Danny"));
		
 		
		SeatingChart chart = new SeatingChart(studentList, rows, cols);
		
	}

}
