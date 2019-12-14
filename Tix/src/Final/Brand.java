package Final;

public enum Brand {
	GIBSON(1902),
	YAMAHA(1887),
	OVATION(1965),
	WASHBURN(1865),
	TAYLOR(1974);
	
	private int Founded;
	
	private Brand(int Founded) {
		this.Founded = Founded;
	}
	
	public int getFounded() {
		return Founded;
	}
}
