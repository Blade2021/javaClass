
public class ConcertTicket extends Ticket{
	
	private String genre;
	
	public ConcertTicket(String eventName, double price, char row, int seatNumber, String genre) {
		super(eventName, price, row, seatNumber);
		this.genre = genre;
	}
	
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void printTicket() {
		System.out.println("*********");
		System.out.println(this.genre + " Concert Series");
		System.out.println("*********");
		
		super.printTicket();
		
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
	
	public String getPromoCode() {
		return this.getEventName().substring(0, 4) + this.getDate(0);
	}
}
