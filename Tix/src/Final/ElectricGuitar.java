package Final;

public class ElectricGuitar extends Guitar{
	private char pickupType;
	
	public ElectricGuitar(int serialNumber, Brand brand, String color, int stringCount, char pickupType) {
		super(serialNumber, "Electric Guitar", brand, color, stringCount);
		this.setPickupType(pickupType);
	}

	public char getPickupType() {
		return pickupType;
	}

	public void setPickupType(char pickupType) {
		this.pickupType = pickupType;
	}
	
	public void printInfo() {
		super.printInfo(); // Call the printInfo method from Guitar
		System.out.println("Pickup Type: " + this.pickupType);
	}

}
