package MidTerm;

import java.util.Scanner;

public class MusicStore {

	private Instrument[] inventory;
	private int storageAmount;

	public MusicStore(int storageAmount) {
		this.storageAmount = storageAmount;
		inventory = new Instrument[storageAmount];
	}

	public void fillInventory() {
		for(int indx = 0; indx < storageAmount; indx++) {
			inventory[indx] = new Guitar((100+indx),"Taylor", "white",4);
		}
	}

	//Fill inventory amount with instrument[Guitar]
	public void fillInventoryGuitar(int start, int end) {
		for(int indx = start; indx < end; indx++) {
			try {
				inventory[indx] = new Guitar((100+indx),"Taylor", "white",4);
			}
			catch(Exception ArrayIndexOutOfBoundsException) {
				System.out.println("Array Index exceeded");
			}
		}
	}

	//Fill inventory amount with instrument[Electric Guitar]
	public void fillInventoryElectricGuitar(int start, int end) {		
		for(int indx = start; indx < end; indx++) {
			try {
				inventory[indx] = new ElectricGuitar((100+indx),"Taylor", "white",4,'C');
			}
			catch(Exception ArrayIndexOutOfBoundsException) {
				System.out.println("Array Index exceeded");
			}
		}
	}

	// Print ALL inventory
	public void printInstrument() {
		for(int indx = 0; indx < inventory.length; indx++) {
			try {
				inventory[indx].printInfo();
				System.out.println("\n ------------------- \n"); //Print separator
			}
			catch(Exception NullPointerException) {
				System.out.println("No instrument found at inventory address[" +indx +"]");
			}
		}
	}

	public void addInventory(int type) {
		String cont = "yes";
		int indx = 0;

		do {
			Scanner input = new Scanner(System.in);
			System.out.println("What type of instrument are you adding?\nGuitar or Elecric Guitar");
		} while((indx < inventory.length));
	}



	//Call printInfo method from appropriate class
	public void printInstrument(int SerialNumber) {
		inventory[SerialNumber].printInfo();
	}

}
