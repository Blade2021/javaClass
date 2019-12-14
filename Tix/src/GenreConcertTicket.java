
public class GenreConcertTicket extends Ticket{
	
	public enum Genre{
		ROCK,
		POP,
		CLASSICAL,
		COUNTRY,
		TECHNO; // <-- don't forget the ; :D!
	}
	
	//private String genre;
	private Genre genre;
	
	public GenreConcertTicket(String eventName, double price, char row, int seatNumber, Genre genre) {
		super(eventName, price, row, seatNumber);
		this.genre = genre;
	}
	
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public void hypeMessage(Genre genre) {
		switch(genre) {
		case COUNTRY:
			System.out.println("Get yer boots ready! Its honky time!");
			break;
		case CLASSICAL:
			System.out.println("Ladies and gents, Please take my upmost gratitude for joining us tonight");
			break;
		case ROCK:
			System.out.println("LIIIGGGHHHHTTSSSS OOOOUUUUTTT!!!");
			break;
		case TECHNO:
			System.out.println("beep beep");
			break;
		case POP:
			System.out.println("Alright alright, everyone get ready for this next hit!");
			break;
		}
			
	}
	
	public void printTicket() {
		System.out.println("*********");
		System.out.println(this.genre + " Concert Series");
		System.out.println("*********");
	    System.out.println("TICKET");
	    System.out.println(this.getEventName());
	    System.out.println("$" + getPrice());
	    System.out.println("Seat " + this.getRow() + "-" + this.getSeatNumber());
	    System.out.println("*********");
	    System.out.println(getPromoCode());
	}
	
	
	public static void main(String[] args) {
		GenreConcertTicket Ozzy = new GenreConcertTicket("Crazy Train", 130.00, 'A', 5, Genre.TECHNO);
		GenreConcertTicket SquareNight = new GenreConcertTicket("Honky Tonky Square Dance", 3.00, 'F', 2, Genre.COUNTRY);
		
		Ozzy.hypeMessage(Ozzy.getGenre());
		SquareNight.hypeMessage(SquareNight.getGenre());
		
		System.out.println("\n************* SEPERATOR *****************\n");
		
		listGenres();
	}
	
	public static void listGenres() {
		Genre[] genreAll = Genre.values();
		for(Genre x: genreAll) {
			System.out.println(x);
		}
	}
	
	public String getPromoCode() {
		return this.getEventName().substring(0, 4) + this.getDate(0);
	}
}
