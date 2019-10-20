package MidTerm;

public class Runner {

	public static void main(String[] args) {
		MusicStore Bennington = new MusicStore(7);
		Bennington.fillInventoryGuitar(0,3);
		Bennington.fillInventoryElectricGuitar(3,7);
		
		//Bennington.addInventory();
		
		//Bennington.printInstrument();
		//Bennington.setAvailable();
		//Bennington.printInstrument();
		
		
		Bennington.setAvailable(103, true);
		Bennington.printInstrument(103);
		
		Bennington.writeFile();
	}

}
