
public class TicketSeller{
	
	public static void main(String[] args) {
		int seatNum = 2;
		
		Ticket game = new Ticket("Red Sox vs yankees", 120.00, 'B', seatNum);
		
		for(int index = 0; index < 20; index++) {
			seatNum += 2;
		}
	}
	
}
