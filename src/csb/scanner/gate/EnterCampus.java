package csb.scanner.gate;

import java.util.Scanner;
import csb.enter.system.*;
import csb.idnumber.exceptions.*;

public class EnterCampus {


	public static void main(String[] args) 
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter your ID number: ");
			String idNumber = scanner.nextLine();
			
			
			EnterGateway eg = new EnterGateway();
			eg.enterCampus(idNumber);
		}
		catch(AlumnaIdNumberException aine)
		{
			System.err.println(aine.getMessage());
		}
		catch(InvalidIdNumberException iine)
		{
			System.err.println(iine.getMessage());
		}
		catch(ProfessorIdNumberException pine)
		{
			System.err.println(pine.getMessage());
		}

	}

}
