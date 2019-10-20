package MidTerm;

public class Runner {

	public static void main(String[] args) {
		MusicStore Bennington = new MusicStore(8);
		Bennington.fillInventoryGuitar(0,3);
		Bennington.fillInventoryElectricGuitar(4,7);
		Bennington.printInstrument();
	}

}
