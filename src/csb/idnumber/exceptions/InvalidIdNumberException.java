package csb.idnumber.exceptions;

public class InvalidIdNumberException extends Exception
{
	public InvalidIdNumberException (String message) 
	{
		super(message);
	}
	
	public InvalidIdNumberException()
	{
		super("This ID Number is INVALID do not give privelage to enter the campus!!");
	}
}
