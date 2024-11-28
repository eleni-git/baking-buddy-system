import java.util.Scanner;

public class ErrorHandling 
{
	public Scanner userInput = new Scanner(System.in);
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


	//fix this as well
	public static boolean checkIfDouble(String trialDouble)
	{
		try 
		{ 
			Double.parseDouble(trialDouble); 
            return true;
		}  
		catch (NumberFormatException e)  
		{ 
            System.out.println("Error, please enter a valid decimal number");
			return false;
		} 
	}

	public int TrialMenuOption()
	{
		Menus menus = new Menus();
		do{
			menus.SetTrialMenuOption(userInput.nextLine());
			if (ErrorHandling.checkIfInteger(menus.GetTrialMenuOption()))
			{
				menus.SetMenuOption(Integer.parseInt(menus.GetTrialMenuOption()));
			}
			else
			{
				System.out.println(menus.GetTrialMenuOption() + " is not a valid entry. Please enter a number:");
			}
			
		}while(ErrorHandling.checkIfInteger(menus.GetTrialMenuOption()) == false);
		return menus.menuOption;
	}
	
	//For doubles?
} 

