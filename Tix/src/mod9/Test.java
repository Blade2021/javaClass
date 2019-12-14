package mod9;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(brr(3543));
		
	}
	
	static int brr (int x)
	{
		if (x == 0)
			return 0;
		else
			//review the % operator if needed
			return ((x % 10) + brr(x/10)); 	
}



}
