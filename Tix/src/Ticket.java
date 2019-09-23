/**
 * A class that constructs tickets for a theater
 * @author Charlie MacFadyen
 */
public abstract class  Ticket {
	private String eventName;
	private double price;
	private char row;
	private int seatNumber;
	private int month;
	private int day;
	private int year;
	

	public Ticket(String eventName, double price, char row, int seatNumber) {
		this.eventName = eventName;
		this.price = price;
		this.row = row;
		this.seatNumber = seatNumber;
	}

	public void printTicket() {
		System.out.println(this.getDate());
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
	
	public int[] getDate() {
		int [] date = new int[3];
		date[0] = this.month;
		date[1] = this.day;
		date[2] = this.year;
		return date;
	}
	
	public int getDate(int index) {
		int [] date = new int[3];
		date[0] = this.month;
		date[1] = this.day;
		date[2] = this.year;
		return date[index];
	}
	
	public void setDate(int year, int day, int month) {
		this.year = year;
		this.day = day;
		this.month = month;
	}
	
	public abstract String getPromoCode();


}