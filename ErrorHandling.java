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

	public int TrialYearsBaking()
	{
		User user = new User();
		do{
            user.SetTrialInput(userInput.nextLine());
            if (checkIfInteger(user.GetTrialInput()))
            {
                user.SetYearsBaking(Integer.parseInt(user.GetTrialInput()));
				return user.GetYearsBaking();
            }
            else
            {
                System.out.println(user.GetTrialInput() + " is not a valid entry. Please enter a number:");
            }
            
        }while(checkIfInteger(user.GetTrialInput()) == false);
		return -1;
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
	
	public double CheckIfDoubleIngredients()
	{
		try{
            return userInput.nextDouble();	
        }
        catch(Exception e)
        {
            System.out.println("Error, please ensure you enter a number");
			return 0;
        }
	}
	
	public static void waitBeforeContinuing(int milliseconds) 
	{
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
	}
} 

