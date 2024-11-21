import java.util.Scanner;

public class Menus{
    public Scanner userInput = new Scanner(System.in);
    public void mainMenu(String firstname, int yearsBaking)
    {
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
                    Reccommendations reccommendations = new(Reccommendations)
                    Reccommendations.bakingReccommendations(firstname, yearsBaking);
                    break;
                case 2:
                    //method4(firstname);
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
}