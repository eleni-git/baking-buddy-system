import java.util.Scanner;

public class User 
{
    public static Scanner userInput = new Scanner(System.in);
    public static String firstname;
    public static int yearsBaking;

    public static String getFirstname()
    {
        return firstname;
    }
    public static int yearsBaking()
    {
        return yearsBaking;
    }
    

    public static void GatherInformation()
    {
        System.out.println("Hello and welcome to your digital baking assistant: Baking Buddy. Before we start, lets collect some data about you.");
        System.out.println("What is your first name? ");
        String firstname = userInput.nextLine();
        System.out.println("How many years have you been baking?");
        // Integer yearsBaking= userInput.nextInt();
    }
}
