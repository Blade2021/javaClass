package Week8;

public class FactorIt extends Thread implements Runnable{
	private long target = 0;
	private long start = 0;
	private long end = 0;
	
	
	@Override
	public void run() {
		for(long indx = start; indx < end; indx++) {
			if((target % indx) == 0) {
				System.out.println(indx + " ");
			}
		}
	}


	public void setTarget(long target) {
		this.target = target;
	}


	public void setStart(long start) {
		this.start = start;
	}


	public void setEnd(long end) {
		this.end = end;
	}
	
	
	
}
