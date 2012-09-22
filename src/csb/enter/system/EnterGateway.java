package csb.enter.system;
import csb.idnumber.exceptions.*;


public class EnterGateway
{
	public void enterCampus(String idNumber)throws AlumnaIdNumberException, InvalidIdNumberException, ProfessorIdNumberException
	
	{
		if (idNumber.equals("10151043"))
		{
			//alumna
			throw new AlumnaIdNumberException("Alumna of DLS-CSB");
			
		}
		else if (idNumber.equals("00000000"))
		{
			//expired credit card
			throw new InvalidIdNumberException("ID NUMBER IS INVALID");
		}
		else if (idNumber.equals("99999999"))
		{
			//max credit card
			throw new ProfessorIdNumberException("Professor of DLS-CSB");
		}
		
		else 
		{
			System.out.println("Welcome STUDENT of De La Salle-College of Saint Benilde!");
		}
	}
}
