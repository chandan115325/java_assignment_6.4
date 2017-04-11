// NegativeAgeException class to throw and handle user defined NegativeAgeException.
class NegativeAgeException extends Exception{
	
	// parameterized constructor to handle the user defined NegativeAgeException.
	
	public NegativeAgeException(String msg)
	{
		super(msg);
	}
}
public class ExceptionExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExceptionExample e = new ExceptionExample();
		e.CheckAge(-2);
	}
	
	//CheckAge method is defined to check out the age and if it is negative then throw NegativeAgeException.
	public void CheckAge(int age)throws NegativeAgeException
	{
		if(age<0)
		{
			throw new NegativeAgeException("NegativeAgeException");
		}
	}

}
