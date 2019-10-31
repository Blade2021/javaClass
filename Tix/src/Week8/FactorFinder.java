package Week8;

import java.util.Scanner;

public class FactorFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long localTarget = input.nextLong();
		input.nextLine();
		
		long quarterMark = localTarget/4;
		long halfMarker = localTarget/2;
		
		FactorIt factorOne = new FactorIt();
		factorOne.setStart(1);
		factorOne.setEnd(quarterMark);
		factorOne.setTarget(localTarget);
		factorOne.start();
		
		FactorIt factorTwo = new FactorIt();
		factorTwo.setStart(quarterMark);
		factorTwo.setEnd(halfMarker);
		factorTwo.setTarget(localTarget);
		factorTwo.start();
	}

}
