import java.util.Scanner;

//To do:
//Try catch for how many years baking


public class BakingBuddy
{
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello and welcome to your digital baking assistant: Baking Buddy. Before we start, lets collect some data about you.");
        System.out.println("What is your first name? ");
        String firstname = userInput.nextLine();
        System.out.println("How many years have you been baking?");
        Integer yearsBaking= userInput.nextInt();
        userInput.nextLine();

        System.out.println("Ok, all information has been gathered. ");

        //Gives a personalised welcome message
        if(yearsBaking==0)
        {
            System.out.println(yearsBaking + " is okay, you'll have fun learning as a total beginner " + firstname + "!");
        }
        else if(yearsBaking <= 3)
        {
            System.out.println("Wow" + firstname +  "! Starting to get experience under your belt with " + yearsBaking + " years experience.");
        }
        else
        {
            System.out.println("You must be a pro " + firstname + "! Lets hope this system can help manage the more complex bakes you must be doing having baked for " + yearsBaking + " years.");
        }

        mainMenu(firstname, yearsBaking);
       
    }

    private static void mainMenu(String firstname, int yearsBaking)
    {
        Scanner userInput = new Scanner(System.in);
        boolean cont;

        do
        {
            System.out.println("MAIN MENU:");
            System.out.println("Please select your option by typing 1 to 4");
            System.out.println("Option 1: Randomly select something to bake based on your years of experience");
            System.out.println("Option 2: 'Digital Pantry' menu");
            System.out.println("Option 3: Conversions menu");
            
            Integer menuOption = userInput.nextInt();
            System.out.println("Congratulations " + firstname + " you have selected option " + menuOption + ".");
            
            switch(menuOption)
            {
                case 1:
                    System.out.println("Hello");
                    bakingReccommendations(yearsBaking, firstname);
                    break;
                case 2:
                    //method4(firstname);
                    break;
            }
            
            cont = ContinueOrNot();
        } while(cont == true);

    }

    private static void bakingReccommendations(int yearsBaking, String firstname)
    {
        int randomIndex = (int)(Math.random() *2);
        String[] beginnerBakes = {"cookies", "brownies", "cupcakes", "rocky road"};
        String[] intermediateBakes = {"chocolate fudge cake", "sticky toffee pudding", "victoria sponge cake", "no bake cheesecake"};
        String[] AdvancedBakes = {"prinzregententorte", "prinsesstårta (princess cake)", "Yule log", "Vertical cake"};
        String[] ExpertBakes = {"Croquembouche", "mille feuille", "mini cannoli", "creme brulee"};
        boolean furtherOptions = false;
        
        if(yearsBaking==0)
        {
            System.out.println("Well, " + firstname + ", you've been baking for " + yearsBaking + " years, Baking Buddy reccommends something simple.");
            System.out.println("Baking Buddy has randomly selected " + beginnerBakes[randomIndex] + " based on your expertise level.");
            System.out.println("Would you like further suggestions?");

        }
        else if(yearsBaking <= 3)
        {
            System.out.println("Given " + yearsBaking + " years experience, Baking Buddy would reccommend something intermediate for you " + firstname + ".");
            System.out.println("Baking Buddy has randomly selected " + intermediateBakes[randomIndex] + "based on your expertise level");
        }
        else if(yearsBaking<5)
        {
            System.out.println("");
            System.out.println("Well, " + firstname + ", you've been baking for " + yearsBaking + " years, so Baking Buddy reccommends something advanced.");
            System.out.println("Baking Buddy has randomly selected " + beginnerBakes[randomIndex] + " based on your expertise level.");
        } 
        else
        {
            System.out.println("");
        }

    }

    public static boolean ContinueOrNot()
    {
        boolean cont = true;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you want to continue? yes or no");  
        String yesOrNo = userInput.nextLine();
        
        if(yesOrNo.contentEquals("no"))
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

    
    
}
//System.out.println("Option 2: Display all the contents of your digital pantry");
            //System.out.println("Option 3: Search the contents of your digital pantry");
            //System.out.println("Option 4: Remove contents from your digital pantry");