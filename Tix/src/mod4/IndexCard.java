package mod4;

public abstract class IndexCard {
	/*
	 * Instance data
	 * Note the use of protected to provide access by subclasses
	 */
	protected double width;
	protected double height;
	protected String frontText;
	protected String rearText;

	/**
	 * Constructor
	 * only sets width and height
	 * @param width
	 * @param height
	 */
	public IndexCard(double width, double height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * Returns a string representation of this FlashCard
	 * Overrides the toString method in the Object class
	 */
	public String toString() {
		return ("FRONT\n" 
				+ frontText 
				+"\n********************" 
				+ "\nREVERSE\n" 
				+ rearText)
				+"\n\n" ;
	}
	
	/**
	 * Sets the values of frontText and rearText
	 * as appropriate for the particular subclass
	 */
	public abstract void generateContent();

}
