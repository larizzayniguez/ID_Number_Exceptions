package csb.idnumber.exceptions;

public class ProfessorIdNumberException extends Exception
{
	public ProfessorIdNumberException (String message) 
	{
		super(message);
	}
	
	public ProfessorIdNumberException()
	{
		super("This ID Number belongs to a Professor");
	}
}
