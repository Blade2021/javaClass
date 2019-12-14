package mod9;
/**
 * Week 9 HW Key
 */

enum Genre{
	POP, CLASSICAL, JAZZ, SPOKEN;
}

public class ConcertTicket extends Ticket {

	private Genre genre;

	//Using a String for the genre
	public ConcertTicket(String eventName, double price, char row, int seatNumber, String genre) {
		super(eventName, price, row, seatNumber);
		this.genre = Genre.valueOf(genre.toUpperCase()); //add exception handling
	}

	//Using a Genre for the genre
	public ConcertTicket(String eventName, double price, char row, int seatNumber, Genre genre) {
		super(eventName, price, row, seatNumber);
		this.genre = genre;
	}

	public String getPromoCode() {
		return genre.toString().substring(0, 4) + month;
	}

	public void printTicket() {

		System.out.println("PROMO CODE: " + getPromoCode() + "\n");
		System.out.println("*********");
		super.printTicket();
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = Genre.valueOf(genre);
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public void hypeMessage() {
		switch(this.genre) {
		case POP :
			System.out.println("Enjoy the pop hits");
			break;

		case CLASSICAL :
			System.out.println("Enjoy the great masters");
			break;

		case JAZZ :
			System.out.println("Enjoy the swinging beat");
			break;

		case SPOKEN :
			System.out.println("Open your ears");
			break;

		default :
			System.out.println("Enjoy the show");

		}
	}
	public static void listGenres() {
		for(Genre g : Genre.values()) {
			System.out.println(g);
		}
	}

	public static void main(String[] args) {
		//Testing the use of string
		ConcertTicket ct1 = new ConcertTicket("Ron Carter Quartet", 35, 'A', 6, "Jazz");
		ct1.printTicket();
		ct1.hypeMessage();
		//Testing the use of genre
		ConcertTicket ct2 = new ConcertTicket("Boston Symphony", 35, 'A', 6, Genre.CLASSICAL);
		ct2.printTicket();
		ct2.hypeMessage();

		listGenres();
	}

}