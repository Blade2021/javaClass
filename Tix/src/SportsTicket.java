
public class SportsTicket extends Ticket{
	private int gameNumber;
	
	public SportsTicket(String eventName, double price, char row, int seatNumber, int gameNumber) {
		super(eventName, price, row, seatNumber);
		this.gameNumber = gameNumber;
	}

	public int getGameNumber() {
		return gameNumber;
	}

	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}
	
	public void printTicket() {
		System.out.println("*********");
		System.out.println("Game #" + gameNumber);
		System.out.println("*********");
	    System.out.println("TICKET");
	    System.out.println(this.getEventName());
	    System.out.println("$" + getPrice());
	    System.out.println("Seat " + this.getRow() + "-" + this.getSeatNumber());
	    System.out.println("*********");
	}
	
}
