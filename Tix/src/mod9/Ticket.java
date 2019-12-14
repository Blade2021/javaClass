package mod9;

/**
 * Week 3 Answer Key CIS 2272 A class that constructs tickets for a theater
 * 
 * @author Charlie MacFadyen
 */
public abstract class Ticket {

	protected String eventName;
	protected double price;
	protected char row;
	protected int seatNumber;

	protected int year;
	protected int month;
	protected int day;

	// Constructor (without date)
	public Ticket(String eventName, double price, char row, int seatNumber) {
		this.eventName = eventName;
		this.price = price;
		this.row = row;
		this.seatNumber = seatNumber;

	}

	// Constructor (with date)
	public Ticket(String eventName, double price, char row, int seatNumber, int year, int month, int day) {
		this.eventName = eventName;
		this.price = price;
		this.row = row;
		this.seatNumber = seatNumber;
		this.year = year;
		this.month = month;
		this.day = day;

	}

	public void printTicket() {

		System.out.println("*********");
		System.out.println("TICKET");
		System.out.println(eventName);
		System.out.println(getDate());
		System.out.printf("$" + "%.2f%n", price);
		System.out.println("Seat " + row + "-" + seatNumber);
		System.out.println("*********");
	}

	/**
	 * return the data as a String
	 */
	public String getDate() {
		return month + "/" + day + "/" + year;
	}

	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// abstract method to be implemented in subclasses
	public abstract String getPromoCode();

}