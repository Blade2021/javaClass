package Week8;

public class Countdown extends Thread{

	public static void main(String[] args) {
		int count = 10;
		do {
			try {
				System.out.println(count);
				count--;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while(count>0);
	}

}
