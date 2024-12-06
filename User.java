import java.util.Scanner;

public class User 
{
    public Scanner userInput = new Scanner(System.in);
    public String firstname;
    //Takes input as a string which is converted to int or caught in ErrorHandling.java
    public String trialInput; 
    public int yearsBaking;

    //getters and setters
    public String GetFirstname()
    {
        return firstname;
    }
    public int GetYearsBaking()
    {
        return yearsBaking;
    }
    public String GetTrialInput()
    {
        return trialInput;
    }
    public void SetFirstname(String firstname) 
    { 
        this.firstname = firstname; 
    }
    public void SetYearsBaking(int yearsBaking) 
    { 
        this.yearsBaking = yearsBaking; 
    }
    public void SetTrialInput(String trialInput)
    {
        this.trialInput = trialInput;
    }

    //This method welcomes the user and takes their detials to give the rest of the program a more personalised feel
    public void GatherInformation()
    {
        ErrorHandling errorHandling = new ErrorHandling();
        System.out.println("Hello and welcome to your digital baking assistant: Baking Buddy. Before we start, lets collect some data about you.");
        System.out.println("What is your first name? ");
        SetFirstname(userInput.nextLine());
        System.out.println("How many years have you been baking?");
        SetYearsBaking(errorHandling.TrialYearsBaking());
        System.out.println("Ok, all information has been gathered. ");
        PersonalisedWelcome();
    }

    //This gives the first user specific message, and then calls the main menu
    public void PersonalisedWelcome()
    {
        if(GetYearsBaking()==0)
        {
            System.out.println(GetYearsBaking() + " is okay, you'll have fun learning as a total beginner " + GetFirstname() + "!");
        }
        else if(yearsBaking <= 3)
        {
            System.out.println("Wow " + GetFirstname() +  "! " + GetYearsBaking() + " years experience under your belt already!");
        }
        else
        {
            System.out.println("You must be a pro " + GetFirstname() + "! Lets hope this system can help manage the more complex bakes you must be doing having baked for " + GetYearsBaking() + " years.");
        }

        Menus menus = new Menus();
        menus.mainMenu(GetFirstname(), GetYearsBaking());
    }
}
