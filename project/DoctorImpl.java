package Hospital;

import java.sql.Connection;

public class DoctorImpl implements DoctorDao  {

	
	/*public void setPrescription(Doctor d) 
	{
		System.out.println("Prescription set : "+d.getName());
		
	}*/

	
	public void addDoctor(Doctor d){
		

		HospitalInsert hospitalinsert=new HospitalInsert();
		
	//	System.out.println(d.getId()+d.getName()+d.getAge()+d.getSpec()+d.getGender());
		
		try {
			int f1=0,f2=0;
			Connection con=ConnectionProvider.provideConnection();
			con.setAutoCommit(false);
			if(hospitalinsert.insert("doctor",d.getId(),d.getName(),d.getAge(),d.getSpec(),d.getGender()))
			{
				f1=1;
			}
			if(hospitalinsert.insert("login",d.getId(),d.getPassword(),"doctor")){
				f2=1;
			}
			if(f1==1 && f2==1)
			{
				con.commit();
			}
			else
				con.rollback();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	
	
	

}
