
public class BoxOffice {
	/*
	 * Here is the data for a BoxOffice.
	 * Note that there is a one-dimensional array of Tickets
	 * The tickets are indexed starting at 0 
	 * (so, seat A-1 is at index 0, A-2 is at index 1, etc.)
	 */
	
	
	private int numRows, seatsPerRow;
	private Ticket[] inventory;
	
	/*
	 * Write a constructor below that accepts the number of rows and seatsPerRow as parameters.  
	 * The constructor should set the numRows and seatsPerRow fields to these values, 
	 * then instantiate the inventory variable to be the proper size
	 * (hint-- how many tickets will there be total?)
	 * Assume all rows have the same number of seats.
	 * Note that you are not creating any Tickets yet-- just setting up the array.
	 */
	
	//Write the constructor here//
	public BoxOffice(int numRows, int seatsPerRow) {
		this.numRows = numRows;
		this.seatsPerRow = seatsPerRow;
		int ticketCount = numRows * seatsPerRow;
		inventory = new Ticket[ticketCount];
	}
	
	/*
	 * The fillInventory method is prewritten for you. Answer each question 
	 * from Canvas in a separate text file.
	 */
	public void fillInventory(String eventName, double price) {
		int t=0;
		
		//65 is the decimal value of uppercase A
		
		for(int row = 65; row < 65+numRows; row++) {
			for(int seat = 1; seat <= seatsPerRow; seat++) {
				inventory[t] = new Ticket(eventName, price, (char)row, seat);
				t++;	
			}
		}
	}
	
	/*
	 * Write a method called printInventory that does not return anything.
	 * It should print each Ticket in the inventory, using the appropriate method
	 * from the Ticket class.
	 */
	
	//Write printInventory here//
	public void printInventory() {
		for(int indx = 0; indx < inventory.length; indx++) {
			System.out.println(inventory[indx]);
		}
		//System.out.println(inventory[0]);
	}
	

	/*
	 * Write a method called getTicket.  It will return the Ticket based on an input number.
	 * The number can be from 1 to the end of the inventory (e.g. ticket 35 or 173, etc.)
	 * It is NOT the seat number.
	 */
	
	//Write getTicket here//
	
	/*
	 * This main method creates a BoxOffice,
	 * fills and prints its inventory
	 * Finally, it gets and prints a specific ticket.
	 */
	public static void main(String[] args) {
		BoxOffice flynnBox = new BoxOffice(5, 12);
		flynnBox.fillInventory("VT Symphony", 45.25);
		flynnBox.printInventory();
		
		//Get, then print, the ticket at index 3 (should be seat A-4)
		//flynnBox.getTicket(3).printTicket();
	}
	
	
}
