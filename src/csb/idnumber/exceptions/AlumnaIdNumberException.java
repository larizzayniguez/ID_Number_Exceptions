package csb.idnumber.exceptions;

public class AlumnaIdNumberException extends Exception
{
	public AlumnaIdNumberException (String message) 
	{
		super(message);
	}
	
	public AlumnaIdNumberException()
	{
		super("This ID Number belongs to an ALUMNA");
	}
}
