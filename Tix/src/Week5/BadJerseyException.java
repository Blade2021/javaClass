package Week5;

public class BadJerseyException extends Exception {
	int JerseyNumber;
	
	BadJerseyException(int JerseyNumber){
		this.JerseyNumber = JerseyNumber;
	}
	
	public String toString() {
		return JerseyNumber + " is not a valid input for Jersey";
	}
}
