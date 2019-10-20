package MidTerm;

public class Runner {

	public static void main(String[] args) {
		MusicStore Bennington = new MusicStore(7);  // Generate the inventory array
		Bennington.fillInventoryGuitar(0,3); //Fill inventory with guitars
		Bennington.fillInventoryElectricGuitar(3,7); //Fill inventory with electric guitars
		
		//Bennington.addInventory();
		
		Bennington.printInstrument();  //Print single instrument from array
		Bennington.setAvailable(); //Set status of instrument in inventory
		Bennington.printInstrument(); //Print single instrument from array
		
		
		Bennington.setAvailable(103, true); //Set status of instrument in inventory (overloaded method)
		Bennington.printInstrument(103); //Set status of instrument in inventory (overloaded method)
		
		Bennington.writeFile(); //Write inventory stats to file
		
		Bennington.play(12); //Example of exception handling
		Bennington.play(102); //Example of implementation without exception
	}

}
