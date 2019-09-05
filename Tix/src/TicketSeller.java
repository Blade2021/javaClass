
public class TicketSeller{
	
	public static void main(String[] args) {
		int seatNum = 2;
		
		Ticket game = new Ticket();
		game.setEventName("Red Sox vs Yankees");
		game.setTicketPrice(120.00);
		game.setSeatRow('B');
		
		
		for(int index = 0; index < 20; index++) {
			game.setSeatNum(seatNum);
			game.printOut();
			seatNum += 2;
		}
	}
	
}
