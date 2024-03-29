package MidTerm;

import java.util.Scanner;
import java.io.*;

public class MusicStore implements Playable{

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
	public void printInstrumentALL() {
		System.out.println("\n\nPRINTING INVENTORY:\n");
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
	
	public void printInstrument() {

		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter serial number of instrument to print");
			int inputSerialNumber = input.nextInt();
			input.nextLine();
			
			printInstrument(inputSerialNumber);
			
		}
		catch(Exception InputMismatchException) {
			System.out.println("Incorrect value");
		}		
	}
	
	//Call printInfo method from appropriate class
	public void printInstrument(int SerialNumber) {
		//System.out.println("\n");
		for(int indx = 0;indx < inventory.length; indx++) {
			try {
				if(inventory[indx].getSerialNumber() == SerialNumber) {
					inventory[indx].printInfo();
				}
			}
			catch(Exception NullPointerException) {
				// do nothing
			}
		}
		
		System.out.println("\n ------------------- \n"); //Print separator
	}

	public void addInventory() {
		int indx = 0;	
		
		Scanner input = new Scanner(System.in);
		do {
			//Scanner input = new Scanner(System.in);
			System.out.println("What type of instrument are you adding?\n1 - Guitar or 2 - Elecric Guitar 0 - Exit");
			try {
				int inputType = input.nextInt();
				input.nextLine();
				
				if((inputType == 1) || (inputType == 2)) {
					System.out.println("Input guitar brand:");
					String inputBrand = input.nextLine();
					
					System.out.println("Input guitar color:");
					String inputColor = input.nextLine();
					
					System.out.println("Input guitar string count: (INTEGER)");
					int inputStringCount = input.nextInt();
					input.nextLine();
					
					if(inputType == 2) {
						System.out.println("Input guitar pickup type: [CHAR]");
						char inputPickupType = input.nextLine().charAt(0);
						
						inventory[indx] = new ElectricGuitar(indx+100,inputBrand,inputColor,inputStringCount,inputPickupType);
					} else {
						inventory[indx] = new Guitar(indx+100,inputBrand,inputColor,inputStringCount);
					}
					
					indx++;
				}
				
				if(inputType == 0) {
					break;
				}
			}
			catch(Exception InputMismatchException){
				System.out.println("Incorrect value [Exiting Function]");
				break;
			}
		} while((indx < inventory.length));
		
		//input.close();
	}
	
	public void setAvailable() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter serial number of instrument to change");
			int inputSerialNumber = input.nextInt();
			input.nextLine();
			
			System.out.println("Input status of instrument: (0 = unavailable  1 = available)");
			int inputStatus = input.nextInt();
			input.nextLine();
			
			boolean status = false;
			if(inputStatus >= 1) {
				status = true;
			}
			
			setAvailable(inputSerialNumber,status);
		}
		catch(Exception InputMismatchException) {
			System.out.println("Incorrect value");
		}
		finally {
			//input.close();
		}
	}
	
	public void setAvailable(int SerialNumber, boolean status) {
		/*
		 * @param SerialNumber This is the lookup ID of the instrument
		 */
		for(int indx = 0;indx < inventory.length; indx++) {
			try {
				if(inventory[indx].getSerialNumber() == SerialNumber) {
					inventory[indx].setAvailable(status);
				}
			}
			catch(Exception NullPointerException) {
				// do nothing
			}
		}
	}
	
	public void writeFile() {
		try {
			File writeFile = new File("Inventory.txt");
			FileWriter fw = new FileWriter(writeFile);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String writeLine = "line";
			for(int indx = 0; indx < inventory.length; indx++) {
				if(inventory[indx] != null) {
					bw.write("Serial: "+inventory[indx].getSerialNumber());
					bw.newLine();
					bw.write("Type: "+inventory[indx].getType());
					bw.newLine();
					bw.write("Brand: "+inventory[indx].getBrand());
					bw.newLine();
					bw.newLine();
				}
			}
			
			bw.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Something terrible went wrong :( ");
		}
	}
	
	private int getArrayIndex(int SerialNumber) {
		int indx;
		for(indx = 0;indx < inventory.length; indx++) {
			try {
				if(inventory[indx].getSerialNumber() == SerialNumber) {
					break;
				}
			}
			catch(Exception NullPointerException) {
				// do nothing
			}
		}
		return indx;
	}

	public void play(int SerialNumber) {
		try{
			int index = getArrayIndex(SerialNumber);
			String instrument = inventory[index].getType();
			System.out.println(instrument + " being played");
		}
		catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("No data available");
		}
	}
	
}
