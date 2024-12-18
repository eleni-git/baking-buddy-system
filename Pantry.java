import java.util.ArrayList;
import java.util.Scanner;

public class Pantry 
{
    Menus menus = new Menus();
    User user = new User();
    public Scanner userInput = new Scanner(System.in);
    //Loads list with the data (list of ingredients) provided in the CreateList method
    public static ArrayList<Ingredients> list = CreateList();
    public ArrayList<Ingredients> searchList;
    public String searchTerm;
    public double updateValue;

    
    //getters and setters
    public ArrayList<Ingredients> GetList()
    {
        return list;
    }
    public String GetSearchTerm()
    {
        return searchTerm;
    }
    public double GetUpdateValue()
    {
        return updateValue;
    }
    public void SetSearchTerm(String searchTerm)
    {
        this.searchTerm = searchTerm;
    }
    public void SetUpdateValue(double updateValue)
    {
        this.updateValue = updateValue;
    }

    //Creates and returns a list of both types of ingredients for the user to display/search/update/add to
    public static ArrayList<Ingredients> CreateList()
    {
        //Creates blank list
        ArrayList<Ingredients> ingredientsList = new ArrayList<>();
        //Instantiates each object one at a time, adding it to the list
        ingredientsList.add(new LooseIngredients("Plain flour", 35, 3.00,1, 100.00, "kg"));
        ingredientsList.add(new LooseIngredients("Self-raising flour", 40, 3.50,2,  100.00, "kg"));
        ingredientsList.add(new LooseIngredients("Golden caster sugar", 27, 2.00,3,  75.00, "kg"));
        ingredientsList.add(new LooseIngredients("Light brown sugar", 40, 4.00,4,  75.00, "kg")); 
        ingredientsList.add(new LooseIngredients("Sweetened condensed milk",10, 1.99,5,  25, "L"));
        ingredientsList.add(new LooseIngredients("Evaporated milk",10, 1.99,6,  12, "L"));
        ingredientsList.add(new LooseIngredients("Chocolate chips", 2, 7.50,7,  25.00, "kg"));

        ingredientsList.add(new BoxedIngredients("Eggs",10, 1.99,8,  12));
        ingredientsList.add(new BoxedIngredients("Digestive biscuits",10, 1.99,9, 15));
        ingredientsList.add(new BoxedIngredients("Salted butter",15, 2.99,10, 12));
        ingredientsList.add(new BoxedIngredients("Unsalted butter",20, 2.99,11, 12));
        
        return ingredientsList;
    }

    //Loops through the list passed in and displays each ingredient using the ToString() method defined in its corresponding class, pausing before
    //it prints the next one
    public void DisplayIngredients(ArrayList<Ingredients> list)
    {
        for(int i = 0; i < list.size(); i++) 
        {
            System.out.println(list.get(i).ToString());
            ErrorHandling.waitBeforeContinuing(1000);
        }
    }

    //Checks if user input matches items stored in the list, displaying any matches, or informing the user if no matches are found.
    public void SearchIngredients()
    {
        SetSearchTerm(userInput.nextLine().trim());
        boolean searchValueFound = false;
        for(int i = 0; i < list.size(); i++) 
        {
            if(list.get(i).GetName().toLowerCase().contains(GetSearchTerm()) || list.get(i).GetName().toLowerCase().contains(GetSearchTerm().toLowerCase()))
            {
                searchValueFound = true;
                System.out.println("Match found: ");
                System.out.println(list.get(i).ToString() + "\n");
            }    
        }
        if(!searchValueFound)
            {
                System.out.println("No matches found, this item does not exist in the pantry.");
                
            }   
    }

    public void UpdateIngredients()
    {
        System.out.println("Please enter the item ID you would like to update: ");
        SetSearchTerm(userInput.nextLine().trim());
        System.out.println("Please enter the amount of ingredient added or used (-ve): ");
        try 
        {
            SetUpdateValue(userInput.nextDouble());
        } catch (Exception e)  //- fail fast to reduce cyclomatic complexity
        {
            System.out.println("Please ensure you enter a number quantity");
            menus.mainMenu(user.GetFirstname(), user.GetYearsBaking());
        }

        boolean itemExists = false;

        for(int i = 1; i < list.size()+1; i++)
        {
            try
            {
                if(Integer.parseInt(GetSearchTerm()) == i)
                {
                    MaximumCapacityExceeded(i);
                    MinimumThresholdBreached(i);
                    list.get(i).SetQuantity((list.get(i).GetQuantity()) + GetUpdateValue());
                    System.out.println("The new value in storage for " + list.get(i).GetName() + " is " + list.get(i).GetQuantity() + " kg");
                    itemExists = true;
                }
            } catch(Exception ex)
            {
                System.out.println("Error, please ensure you enter a number ID");
                menus.mainMenu(user.GetFirstname(), user.GetYearsBaking());
            }
        }
        if(!itemExists) //positive condiitonal
        {
            System.out.println("Error, no item has that ID");
        }
    }
    
    public void MaximumCapacityExceeded(int i)
    {
        if(list.get(i).GetMaximumCapacity() != -1)
        {
            if((list.get(i).GetQuantity() + GetUpdateValue()) > list.get(i).GetMaximumCapacity())
            {
                System.out.println("Error, the amount you are trying to add exceeds the maximum capacity of " + list.get(i).GetMaximumCapacity() + "kg");
                menus.mainMenu(user.GetFirstname(), user.GetYearsBaking());
            }
        }
    }

    public void MinimumThresholdBreached(int i)
    {
        if(list.get(i).GetMaximumCapacity() != -1)
        {
            if((list.get(i).GetQuantity() + GetUpdateValue()) < 0)
            {
                System.out.println("Error, you have attempted to use more of the ingredient than the " + list.get(i).GetQuantity() + "kg currently in storage");
                menus.mainMenu(user.GetFirstname(), user.GetYearsBaking());
            } 
        } 
    }

    public void AddIngredients()
    {
        System.out.println("Enter the type of item you would like to add (Boxed or Loose): ");
        String boxedOrLoose = userInput.nextLine().toLowerCase().trim();
        Ingredients x;
        switch(boxedOrLoose)
        {
            case("b"):
            case("boxed"):
                x = new BoxedIngredients();
                x.AddIngredients();
                x.SetId(list.size()+1);
                list.add(x);
                System.out.println("Ingredient successfully saved");
                break;
            case("l"):
            case("loose"):
                x = new LooseIngredients();
                x.AddIngredients();
                list.add(x);
                x.SetId(list.size()+1);
                System.out.println("Ingredient successfully saved");
                break;
            default:
                System.out.println("Error, please enter either boxed or loose");
                menus.mainMenu(user.GetFirstname(), user.GetYearsBaking());
        }
    }
}
