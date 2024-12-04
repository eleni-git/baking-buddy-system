import java.util.Scanner;

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
    public void SetMenuOption(int menuOption)
    {
        this.menuOption = menuOption;
    }
    
//get trim working?
    public String GetTrialMenuOption()
    {
        return trialMenuOption.trim();
    }

    public void SetTrialMenuOption(String trialMenuOption)
    {
        this.trialMenuOption = trialMenuOption.trim();
    }


    public void mainMenu(String firstname, int yearsBaking)
    {
        boolean cont;
        do
        {
            System.out.println("MAIN MENU:");
            System.out.println("Please select your option by typing 1 to 3");
            System.out.println("Option 1: Randomly select something to bake based on your years of experience");
            System.out.println("Option 2: Conversions menu");
            System.out.println("Option 3: 'Digital Pantry' menu");
 
            SetMenuOption(errorHandling.TrialMenuOption());

            switch(GetMenuOption())
            {
                case 1:
                    System.out.println("Hello");
                    Recommendations recommendations = new Recommendations();
                    recommendations.bakingRecommendations(firstname, yearsBaking);
                    break;
                case 2:
                    ConversionsMenu();
                    break;
                case 3:
                    DigitalPantryMenu();
                    break;
                default:
                    System.out.println("Please ensure you enter a number between 1 and 3");
                    break;
                }
            cont = ContinueOrNot();
        } while(cont == true);
    }

    public boolean ContinueOrNot()
    {
        boolean cont = true;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you want to continue? yes or no");  
        String yesOrNo = userInput.nextLine();
        
        if(yesOrNo.toLowerCase().contentEquals("no"))
        {
            System.out.println("Goodbye! The programme will now exit");
            return cont = false;
        }
        else
        {
            //System.out.println("You want to continue yay!!");
            return cont;
        }
    }

    public void ConversionsMenu()
    {
        System.out.println("CONVERSIONS MENU");
        System.out.println("Please select your option by typing 1 to 2");
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

    public void TemperaturesMenu()
    {
        System.out.println("Temperatures:");
        System.out.println("Please select your option by typing 1 to 2");
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
            default:
                System.out.println("Please ensure you enter a number between 1 and 4");
                break;
        }
    }
}