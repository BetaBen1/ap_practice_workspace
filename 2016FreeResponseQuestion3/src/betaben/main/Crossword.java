package betaben.main;

public class Crossword {

	private Square[][] puzzle;
	
	public Crossword(boolean[][] blackSquares){
		puzzle = new Square[blackSquares[0].length][blackSquares.length];
		for(int r = 0; r<blackSquares[0].length; r++){
			for(int c = 0; c<blackSquares.length; c++){
				puzzle[r][c] = new Square(blackSquares[r][c], r*c);
				if(toBeLabeled(r, c, blackSquares)==true){
					
				}
			}
		}

		
	}
	
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
		/* Returns true if the square at row r, column c should be
		 * labeled with a positive number;
		 * Returns false otherwise.
		 * The square at row r, column c is black if and only if
		 * blackSquares[r][c] is true.
		 * Precondition: r and c are valid indexes in blackSquares.
		 */
		if(blackSquares[r][c] == false){
			if(blackSquares[r+1][c]==true || blackSquares[r][c-1]==true){
				return true;
			}
		}
		return false;
	}
	
}
