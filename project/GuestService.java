package Hospital;

import java.util.Scanner;

public class GuestService 
{
	Guest g = new Guest();
	GuestDao gd = new GuestImpl();
	String name,phone;
	int age;
	String gender;
	
	Scanner sc = new Scanner(System.in);

	public void createAccount()
	{
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter phone: ");
		phone = sc.next();
		System.out.println("Enter age: ");
		age = sc.nextInt();
		System.out.println("Enter gender: ");
		gender = sc.next();
		
		
		
		g.setAge(age);
		g.setGender(gender);
		g.setName(name);
		g.setPhone(phone);
		
		
		gd.addGuest(g);		
	}
	void hospitalDetails()
	{
		System.out.println("CITIUSTECH HOSPITAL");
		System.out.println("AIROLI");
		System.out.println("MINDSPACE");
	}
}
