package ushapackage;

public class Divisionidentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int pert = Integer.parseInt(args[0]);
		
		int pert = 55;
		
		if(pert >= 60)
		{
			System.out.print("First division");
		}else if((pert > 50) && (pert > 59))
		{
			System.out.print("Second division");
		}else if((pert > 40) && (pert > 49))
		{
			System.out.print("Third division");
		}else if(pert > 40)
		{
			System.out.print("Failed");
		}else
		{
			System.out.print("do nothing");
		}	
	}

}
