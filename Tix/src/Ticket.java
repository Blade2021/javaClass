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

}