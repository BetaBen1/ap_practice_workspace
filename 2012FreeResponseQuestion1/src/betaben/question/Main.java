package betaben.question;

public class Main {

	public static void main(String[] args) {

		ClimbingClub hikerClub = new ClimbingClub();
		hikerClub.addClimb("Monadnock", 274);
		hikerClub.addClimb("Whiteface", 301);
		hikerClub.addClimb("Algonquin", 225);
		hikerClub.addClimb("Monadnock", 344);
	
		ClimbingClub.print();
		
	}

}
