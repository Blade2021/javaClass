package Final;

public class Guitar extends Instrument{
	
	private String color;
	private int stringCount;
	
	
	public Guitar(int serialNumber, Brand brand, String color, int stringCount) {
		super(serialNumber,"Guitar", brand);
		this.color = color;
		this.stringCount = stringCount;
	}
	
	public Guitar(int serialNumber, String type, Brand brand, String color, int stringCount) {
		super(serialNumber, type, brand);
		this.color = color;
		this.stringCount = stringCount;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public int getStringCount() {
		return stringCount;
	}


	public void setStringCount(int stringCount) {
		this.stringCount = stringCount;
	}


	public String shortCode() {
		return (super.getBrand() + this.getColor().substring(0,3) + this.getStringCount());
	}
	
	public void printInfo() {
		System.out.println("Available: " + super.isAvailable());
		System.out.println("Type: " + super.getType());
		System.out.println("Serial Number:" + super.getSerialNumber());
		System.out.println("Brand:" + super.getBrand());
		System.out.println("Color:" + this.color);
		System.out.println("String Count: " + this.stringCount);
	}
	
}
