package Final;

public abstract class Instrument {

	private int serialNumber;
	private String type;
	private boolean available;
	private Brand brand;
	
	public Instrument(int serialNumber) {
		this.serialNumber = serialNumber;
		this.available = false; //Set available to false by default (Empty inventory)
	}
	
	public Instrument(int serialNumber, String type, Brand brand) {
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public int getBrandFounded() {
		return brand.getFounded();
	}

	public abstract void printInfo();
	public abstract String shortCode();

}
