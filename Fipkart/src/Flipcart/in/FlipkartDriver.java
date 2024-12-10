package Flipcart.in;

public class FlipkartDriver {

	public static void main(String[] args) {
		Flipcart val = new Flipcart();
		
		System.out.println("Enter your username");
		String val1=val.sc.nextLine();
		System.out.println("Enter your pwd");
		int val2=val.sc.nextInt();
		System.out.println("Enter your Phonenumber");
		long val3=val.sc.nextLong();
		
		val.Items(val1, val2, val3);
	}

}
