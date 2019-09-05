
public class Ticket {
	
	private String eventName;
	private double ticketPrice;
	private char seatRow;
	private int seatNum;
	
	public Ticket() {
		eventName = "Beyonce";
		ticketPrice = 75.50;
		seatRow = 'J';
		seatNum = 32;
	}
	
	public void printOut() {
		System.out.println("******\nTICKET");
		System.out.println(eventName);
		System.out.println('$' + ticketPrice);
		System.out.println("Seat " + seatRow + "-" + seatNum);
		System.out.println("*******");
	}
	
	public String getEventName() {
		return eventName;
	}



	public void setEventName(String eventName) {
		this.eventName = eventName;
	}



	public double getTicketPrice() {
		return ticketPrice;
	}



	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}



	public char getSeatRow() {
		return seatRow;
	}



	public void setSeatRow(char seatRow) {
		this.seatRow = seatRow;
	}



	public int getSeatNum() {
		return seatNum;
	}



	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

}

