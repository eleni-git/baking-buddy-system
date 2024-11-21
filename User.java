import java.util.Scanner;

public class User 
{
    public Scanner userInput = new Scanner(System.in);
    public String firstname;
    public int yearsBaking;

    public String GetFirstname()
    {
        return firstname;
    }
    public int GetYearsBaking()
    {
        return yearsBaking;
    }
    public void SetFirstname(String firstname) 
    { 
        this.firstname = firstname; 
    }
    public void SetYearsBaking(int yearsBaking) 
    { 
        this.yearsBaking = yearsBaking; 
    }

    

    public void GatherInformation()
    {
        System.out.println("Hello and welcome to your digital baking assistant: Baking Buddy. Before we start, lets collect some data about you.");
        System.out.println("What is your first name? ");
        SetFirstname(userInput.nextLine());
        System.out.println("How many years have you been baking?");
        SetYearsBaking(userInput.nextInt());

        //add error handling/ try parse

        System.out.println("Ok, all information has been gathered. ");
        PersonalisedWelcome();
    }

    public void PersonalisedWelcome()
    {
        if(GetYearsBaking()==0)
        {
            System.out.println(GetYearsBaking() + " is okay, you'll have fun learning as a total beginner " + GetFirstname() + "!");
        }
        else if(yearsBaking <= 3)
        {
            System.out.println("Wow " + GetFirstname() +  "!" + GetYearsBaking() + " years experience under your belt already!");
        }
        else
        {
            System.out.println("You must be a pro " + GetFirstname() + "! Lets hope this system can help manage the more complex bakes you must be doing having baked for " + GetYearsBaking() + " years.");
        }
        
        Menus.mainMenu(GetFirstname(), GetYearsBaking());
    }
}
