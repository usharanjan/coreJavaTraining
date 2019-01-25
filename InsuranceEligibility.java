package ushapackage;

public class InsuranceEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mstatus = "married";
		char sex = 'M';
		int	age	= 45;
		
		switch(mstatus)
		{
		case "married":
		System.out.println("eligible for insurance");
		break;
		
		case "unmarried":
			if((sex =='M') &&(age > 30))
			{
				System.out.println("eligible for insurance");
			}else if((sex =='F') &&(age > 25))
			{
				System.out.println("eligible for insurance");
			}
			System.out.println(" not eligible for insurance 1");
		}
		
				
	}

}
