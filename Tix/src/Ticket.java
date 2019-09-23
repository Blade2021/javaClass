/**
 * A class that constructs tickets for a theater
 * @author Charlie MacFadyen
 */
public class Ticket {
	private String eventName;
	private double price;
	private char row;
	private int seatNumber;

	public Ticket(String eventName, double price, char row, int seatNumber) {
		this.eventName = eventName;
		this.price = price;
		this.row = row;
		this.seatNumber = seatNumber;
	}

	public void printTicket() {

		System.out.println("*********");
		System.out.println("TICKET");
		System.out.println(eventName);
		System.out.println("$" + price);
		System.out.println("Seat " + row + "-" + seatNumber);
		System.out.println("*********");
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getRow() {
		return row;
	}

	public void setRow(char row) {
		this.row = row;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}




}