package Hospital;

import java.util.Scanner;

public class AdminService {

	Doctor d = new Doctor();
	DoctorDao dd = new DoctorImpl();
	
	
	
	public void addDoctor()
	{
		
		String name,id,pswd,age,spec,gender;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id: ");
			id = sc.next();
			
			System.out.println("Enter password: ");
			pswd = sc.next();
			
			System.out.println("Enter Name: ");
			name = sc.next();
			System.out.println("Enter age: ");
			age = sc.next();
			System.out.println("Enter Specilization: ");
			spec = sc.next();
			System.out.println("Enter gender: ");
			gender = sc.next();
			
			
		
			d.setId(id);
			d.setAge(age);
			d.setPassword(pswd);
			d.setGender(gender);
			d.setName(name);
			d.setSpec(spec);
			
			dd.addDoctor(d);	
			

		
		}
	

	
	
	
	
	
	
	public void updatePatient(){
		System.out.println("Patient Updated");
	}
	public void checkAvailability(){
		System.out.println("Availability Checked");
	}
	public void generateBill(){
		System.out.println("Bill Generated");
	}
	
	
}
