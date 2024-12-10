package Flipcart.in;

import java.util.Scanner;

public class Flipcart {

	String userName ="Deepak";
	int pwd =5678;
	long phoneNumber =9294845246l;
	int val;
	
	Scanner sc = new Scanner(System.in);
	
	public void Items(String name,int pwds,long phn ) {
		if(userName.equals(name)&&pwd==pwds&&phoneNumber==phn) {
			
			System.out.println("1. Shirt");
			System.out.println("2. jeans");
			System.out.println("1. Shoes");
			System.out.println("1. Watch");
			System.out.println("1. mobile");
			System.out.println("1. chair");
			
			System.out.print("Choose number of items -  ");
			val=sc.nextInt();
			
		 System.out.println("The number of item is " + val);
			
		}else {
			System.out.println("Login Unsucessfull");
		}
	}
}
