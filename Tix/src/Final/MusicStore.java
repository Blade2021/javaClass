/**
 * MusicStore adds inventory management for instruments
 * @author Matt
 */


package Final;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class MusicStore implements Playable{
	//private Instrument[] inventory;
	private int storageAmount;
	
	/**
	 * Instrument List Array for inventory
	 */
	List<Instrument> inventory = new ArrayList<Instrument>();
	
	public MusicStore() {
	}
	
	/**
	 * 
	 * @param storageAmount Initialize array size on creation
	 */
	public MusicStore(int storageAmount) {
		this.storageAmount = storageAmount;
		//inventory = new Instrument[storageAmount];
		for(int indx = 0; indx < storageAmount; indx++) {
			inventory.add(null);
		}
	}
	
	/**
	 * Fill Inventory with guitars
	 */
	public void fillInventory() {
		for(int indx = 0; indx < storageAmount; indx++) {
			inventory.set(indx, new Guitar((100+indx),Brand.TAYLOR, "white",4));
		}
	}

	/**
	 * Fill inventory with guitars
	 * @param start Index of start of loop to add guitars to inventory
	 * @param end Index of end of loop to stop adding guitars to inventory
	 */
	public void fillInventoryGuitar(int start, int end) {
		for(int indx = start; indx < end; indx++) {
			try {
				inventory.set(indx, new Guitar((100+indx),Brand.TAYLOR, "white",4));
			}
			catch(Exception ArrayIndexOutOfBoundsException) {
				//System.out.println("Array Index exceeded");
				try {
					inventory.add(new Guitar((100+indx),Brand.TAYLOR, "white",4));
				}
				catch(Exception e) {
					System.out.println("Something went wrong");
				}
			}
		}
	}
	
	/**
	 * Fill inventory with electric guitars
	 * @param start Index of start of loop to add electric guitars to inventory
	 * @param end Index of end of loop to stop adding electric guitars to inventory
	 */
	public void fillInventoryElectricGuitar(int start, int end) {		
		for(int indx = start; indx < end; indx++) {
			try {
				inventory.set(indx, new ElectricGuitar((100+indx),Brand.TAYLOR, "white",4,'C'));
			}
			catch(Exception ArrayIndexOutOfBoundsException) {
				//System.out.println("Array Index exceeded");
				try {
					inventory.add(new ElectricGuitar((100+indx),Brand.TAYLOR,"white",4,'C'));
				}
			
				catch(Exception e) {
					System.out.println("Something went wrong");
				}
			}
		}
	}

	/**
	 * Print all instruments in inventory
	 */
	public void printInstrumentALL() {
		System.out.println("\n\nPRINTING INVENTORY:\n");
		for(int indx = 0; indx < inventory.size(); indx++) {
			try {
				inventory.get(indx).printInfo();
				System.out.println("\n ------------------- \n"); //Print separator
			}
			catch(Exception NullPointerException) {
				System.out.println("No instrument found at inventory address[" +indx +"]");
			}
		}
	}
	
	/**
	 * Ask operator for what instrument to print
	 */
	public void printInstrument(){

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
	
	/**
	 * Print a instrument of input
	 * @param SerialNumber Serial Number of instrument in inventory.
	 */
	public void printInstrument(int SerialNumber) {
		//System.out.println("\n");
		for(int indx = 0;indx < inventory.size(); indx++) {
			try {
				if(inventory.get(indx).getSerialNumber() == SerialNumber) {
					inventory.get(indx).printInfo();
				}
			}
			catch(Exception e) {
				System.out.println("That instrument doesn't exist");
			}
		}
		System.out.println("\n ------------------- \n"); //Print separator
	}
	
	/**
	 * Add instruments to inventory through input process
	 */
	public void addInventory() {
		int indx = 0;	
		
		Scanner input = new Scanner(System.in);
		do {
			indx = inventory.get(inventory.size()-1).getSerialNumber()+1;
			//System.out.println(inventory.size());
			
			//System.out.println(inventory.get(1).getSerialNumber());
			
			//Scanner input = new Scanner(System.in);
			System.out.println("What type of instrument are you adding?\n1 - Guitar or 2 - Elecric Guitar 0 - Exit");
			try {
				int inputType = input.nextInt();
				input.nextLine();
				
				if((inputType == 1) || (inputType == 2)) {
					System.out.println("Input guitar brand:");
					Brand inputBrand = Brand.valueOf(input.nextLine().toUpperCase());
					
					System.out.println("Input guitar color:");
					String inputColor = input.nextLine();
					
					System.out.println("Input guitar string count: (INTEGER)");
					int inputStringCount = input.nextInt();
					input.nextLine();
					
					if(inputType == 2) {
						System.out.println("Input guitar pickup type: [CHAR]");
						char inputPickupType = input.nextLine().charAt(0);
						
						inventory.add(new ElectricGuitar(indx,inputBrand,inputColor,inputStringCount,inputPickupType));
					} else {
						inventory.add(new Guitar(indx,inputBrand,inputColor,inputStringCount));
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
		} while((indx < inventory.size()));
		
		//input.close();
	}
	/**
	 * Set instrument availability 
	 */
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
	/**
	 * Function to set availability of instrument in inventory
	 * @param SerialNumber Serial number of instrument to set
	 * @param status Boolean of if instrument is available
	 */
	public void setAvailable(int SerialNumber, boolean status) {
		/*
		 * @param SerialNumber This is the lookup ID of the instrument
		 */
		for(int indx = 0;indx < inventory.size(); indx++) {
			try {
				if(inventory.get(indx).getSerialNumber() == SerialNumber) {
					inventory.get(indx).setAvailable(status);
				}
			}
			catch(Exception NullPointerException) {
				// do nothing
			}
		}
	}
	/**
	 * Write inventory to a text file.
	 */
	public void writeFile() {
		try {
			File writeFile = new File("Inventory.txt");
			FileWriter fw = new FileWriter(writeFile);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String writeLine = "line";
			for(int indx = 0; indx < inventory.size(); indx++) {
				if(inventory.get(indx) != null) {
					bw.write("Serial: "+inventory.get(indx).getSerialNumber());
					bw.newLine();
					bw.write("Type: "+inventory.get(indx).getType());
					bw.newLine();
					bw.write("Brand: "+inventory.get(indx).getBrand());
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
	/**
	 * Get array index of serial number
	 * @param SerialNumber Serial number to check
	 * @return Returns array index of found serial number
	 */
	private int getArrayIndex(int SerialNumber) {
		int indx;
		for(indx = 0;indx < inventory.size(); indx++) {
			try {
				if(inventory.get(indx).getSerialNumber() == SerialNumber) {
					break;
				}
			}
			catch(Exception NullPointerException) {
				// do nothing
			}
		}
		return indx;
	}
	/**
	 * Demonstrate playing instrument
	 */
	public void play(int SerialNumber) {
		try{
			int index = getArrayIndex(SerialNumber);
			String instrument = inventory.get(index).getType();
			System.out.println(instrument + " being played");
		}
		catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("No data available");
		}
	}
	/**
	 * Get instrument object
	 * @param SerialNumber Serial number of instrument
	 * @return Instrument Object
	 */
	public Instrument getInstrument(int SerialNumber) {
		int index = getArrayIndex(SerialNumber);
		return inventory.get(index);
	}
	/**
	 * Remove instrument from inventory
	 * @param SerialNumber Serial number instrument to remove
	 */
	public void removeInstrument(int SerialNumber) {
		int index = getArrayIndex(SerialNumber);
		inventory.remove(index);
	}
	
}
