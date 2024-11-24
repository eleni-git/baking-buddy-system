public class ErrorHandling 
{
	public static boolean checkIfInteger(String trialInput) 
	{          
		try 
		{ 
			Integer.parseInt(trialInput); 
            return true;
		}  
		catch (NumberFormatException e)  
		{ 
            return false;
		} 
	} 
} 

