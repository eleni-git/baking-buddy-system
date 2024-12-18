import java.util.Scanner;

//The menu system allows the user to navigate to all of the features in the program
public class Menus{
    public Scanner userInput = new Scanner(System.in);
    ErrorHandling errorHandling = new ErrorHandling();
    Conversions conversions = new Conversions();
    public String trialMenuOption;
    public int menuOption;
    
    //getters and setters
    public int GetMenuOption()
    {
        return menuOption;
    }
    public String GetTrialMenuOption()
    {
        return trialMenuOption.trim();
    }
    public void SetMenuOption(int menuOption)
    {
        this.menuOption = menuOption;
    }
    public void SetTrialMenuOption(String trialMenuOption)
    {
        this.trialMenuOption = trialMenuOption.trim();
    }

    //This method is where the user will be directed back to after compeleting a method or if certain errors fail. 
    public void mainMenu(String firstname, int yearsBaking)
    {
        boolean cont;
        do
        {
            System.out.println("\nMAIN MENU:");
            System.out.println("Please select your option by typing 1 to 4");
            System.out.println("Option 1: Randomly select something to bake based on your years of experience");
            System.out.println("Option 2: Conversions menu");
            System.out.println("Option 3: 'Digital Pantry' menu");
            System.out.println("## Option 4: run tests ## - for Baking Buddy system maintenance only");
            //This is seen in all menus, ensuring an exception isn't thrown and the user gets useful output to help them navigate the menus
            SetMenuOption(errorHandling.TrialMenuOption());

            switch(GetMenuOption())
            {
                case 1:
                    Recommendations recommendations = new Recommendations();
                    recommendations.bakingRecommendations(firstname, yearsBaking);
                    break;
                case 2:
                    ConversionsMenu();
                    break;
                case 3:
                    DigitalPantryMenu();
                    break;
                case 4:
                    Tests tests = new Tests();
                    tests.RunTests();
                    break;
                default:
                    System.out.println("Please ensure you enter a number between 1 and 4");
                    break;
                }
            cont = ContinueOrNot();
        } while(cont == true);
    }
    
    //Allows the program to loop until the user wants to exit. This is called in the main menu as it where the user is always redirected to when a method
    //has successfully completed
    public boolean ContinueOrNot()
    {
        boolean cont = true;
        System.out.println("Do you want to continue? yes or no");  
        String yesOrNo = userInput.nextLine();
        
        //This condition tries to account for user error when typing, e.g. NO/No/nO/no/N/n
        if(yesOrNo.toLowerCase().contentEquals("no") || yesOrNo.toLowerCase().contentEquals("n"))
        {
            System.out.println("Goodbye! The programme will now exit");
            return cont = false;
        }
        else
        {
            return cont;
        }
    }
   
    //This allows the user to select what type of conversion they would like to perform
    public void ConversionsMenu()
    {
        System.out.println("CONVERSIONS MENU");
        System.out.println("Please select your option by typing 1 or 2");
        System.out.println("Option 1: Temperatures");
        System.out.println("Option 2: Weights");
        SetMenuOption(errorHandling.TrialMenuOption());
        
        switch(GetMenuOption())
        {
            case 1:
                TemperaturesMenu();
                break;
            case 2:
                WeightsMenu();
                break;
            default:
                System.out.println("Please ensure you enter a number between 1 and 2");
                break;
        }

    }
    
    //This allows the user to select which temperature conversion they would like to perform, calling the appropriate method
    public void TemperaturesMenu()
    {
        System.out.println("Temperatures:");
        System.out.println("Please select your option by typing 1 or 2");
        System.out.println("Option 1: Celcius to Farenheit");
        System.out.println("Option 2: Farenheit to Celcius");
        SetMenuOption(errorHandling.TrialMenuOption());
            
        switch(GetMenuOption())
        {
            case 1:
                conversions.CelciusToFarenheit();
                break;
            case 2:
                conversions.FarenheitToCelcius();
                break;
            default:
                System.out.println("Please ensure you enter a number between 1 and 2");
                TemperaturesMenu();
        }
    }

    //This allows the user to select which weights conversion they would like to perform, calling the appropriate method
    public void WeightsMenu()
    {
        System.out.println("Weights:");
        System.out.println("Please select your option by typing 1 to 2");
        System.out.println("Option 1: Kilograms (kg) to Grams (g)");
        System.out.println("Option 2: Grams(g) to Kilograms(kg)");
        System.out.println("Option 3: Grams(g) to Ounces(oz)");
        System.out.println("Option 4: Ounces(oz) to Grams(g)");
        SetMenuOption(errorHandling.TrialMenuOption());
            
        switch(GetMenuOption())
        {
            case 1:
                conversions.KilogramsToGramsConversion();
                break;
            case 2:
                conversions.GramsToKilogramsConversion();
                break;
            case 3:
                conversions.GramsToOuncesConversion();
                break;
            case 4:
                conversions.OuncesToGramsConversion();
                break;
            default:
                System.out.println("Please ensure you enter a number between 1 and 4");
                WeightsMenu();
        }
    }
    
    //This is the menu for all of the features associated with the 'digital pantry'. It calls the appropriate methods based on the user's selection.
    public void DigitalPantryMenu()
    {
        Pantry pantry = new Pantry();
    
        System.out.println("WELCOME TO THE DIGITAL PANTRY:");
        System.out.println("Please select your option by typing 1 to 4");
        System.out.println("Option 1: Display all the contents of your digital pantry");
        System.out.println("Option 2: Search the contents of your digital pantry");
        System.out.println("Option 3: Update the contents of your digital pantry");
        System.out.println("Option 4: Add a new ingredient to your digital pantry");
        SetMenuOption(errorHandling.TrialMenuOption());
            
        switch(GetMenuOption())
        {
            case 1:
                pantry.DisplayIngredients(pantry.GetList());
                break;
            case 2:
                System.out.println("Please enter the item you would like to search for");
                pantry.SearchIngredients();
                break;
            case 3:
                pantry.UpdateIngredients();
                break;
            case 4:
                pantry.AddIngredients();
                break;
            default:
                System.out.println("Please ensure you enter a number between 1 and 4");
                break;
        }
    }
}