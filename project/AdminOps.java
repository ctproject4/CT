package Hospital;
import java.util.Scanner;

public class AdminOps {
	
	static int choice = 0;
	
	static AdminService adminservice = new AdminService();
	private AdminOps()
	{
		
	}
	
	public static void adminoperations()
	{
		Scanner sc = new Scanner(System.in);
		
		do
		{
		System.out.println("Welcome Admin..");
		System.out.println("You can perform the following operations:- ");
		System.out.println("Press 1 to Add Doctor");
		System.out.println("Press 2 to Update Patient");
		System.out.println("Press 3 to Check Availability");
		System.out.println("Press 4 to Generate Bill");
		
		
		//all the sysouts
		
		System.out.println("Press 5 to exit admin operations");
		
		
		choice = sc.nextInt();
		
			switch(choice)
			{
			
				case 1:
					adminservice.addDoctor();
					break;
				case 2:
					adminservice.updatePatient();		
					break;
				case 3:
					adminservice.checkAvailability();	
					break;
				case 4:
					adminservice.generateBill();	
					break;
			}
		}while(choice!=5);  
		
	}
}
