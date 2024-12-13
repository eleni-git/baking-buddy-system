import java.util.Scanner;

public class ErrorHandling 
{
	public Scanner userInput = new Scanner(System.in);
	
	//Checks if string input can be parsed to integer, either returning true or catching the exception and returning false
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

	//Checks if string input can be parsed as a double, either returning true or catching the exception and returning false
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

	//As other parts of the program require a value for years baking, it loops until a valid entry has been given
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
		return -1; //Required another return statement, but should never hit this
	}
	
	//Takes string input but loops until it can be parsed as an integer successfully to select a menu option. 
	//(Does not deal with whether it is in range in this method for reusability for all menus, this is instead dealt with in the default 
	//case in the swicth case which will remind the user of which numbers will succesfully navigate somewhere)
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

	//Checks if input is a double and returns it, or an error message
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
	
	//Pauses the execution of the program, slowing output in the console allowing for a better UX
	public static void waitBeforeContinuing(int milliseconds) 
	{
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
	}
} 

