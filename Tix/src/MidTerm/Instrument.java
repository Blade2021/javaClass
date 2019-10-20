package MidTerm;

public abstract class Instrument {

	private int serialNumber;
	private String brand;
	private String type;
	private boolean available;
	
	public Instrument(int serialNumber) {
		this.serialNumber = serialNumber;
		this.available = false; //Set available to false by default (Empty inventory)
	}
	
	public Instrument(int serialNumber, String type, String brand) {
		this.serialNumber = serialNumber;
		this.type = type;
		this.brand = brand;
		this.available = true; //Set available by default
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public abstract void printInfo();
	public abstract String shortCode();

}
