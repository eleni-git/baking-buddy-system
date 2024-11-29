import java.util.ArrayList;
import java.util.Scanner;

// System.out.println("Option 1: Display all the contents of your digital pantry");
//     System.out.println("Option 2: Search the contents of your digital pantry");
//     System.out.println("Option 3: Add contents to your digital pantry");
//     System.out.println("Option 4: Remove contents from your digital pantry");


public class Pantry 
{
    public Scanner userInput = new Scanner(System.in);
    public ArrayList<Ingredients> list = CreateList();
    public ArrayList<Ingredients> searchList;
    public String searchTerm;

    
    //getters and setters
    public ArrayList<Ingredients> GetList()
    {
        return list;
    }
    public ArrayList<Ingredients> GetSearchList()
    {
        return searchList;
    }
    public String GetSearchTerm()
    {
        return searchTerm;
    }
    public void SetList(ArrayList<Ingredients> list)
    {
        this.list = list;
    }
    public void SetSearchList(ArrayList<Ingredients> searchList)
    {
        this.searchList = searchList;
    }
    public void SetSearchTerm(String searchTerm)
    {
        this.searchTerm = searchTerm;
    }




    public ArrayList<Ingredients> CreateList()
    {
        ArrayList<Ingredients> ingredientsList = new ArrayList<>();
        ingredientsList.add(new LooseIngredients("Plain flour", 35, 3.00, 25.00, "kg"));
        ingredientsList.add(new LooseIngredients("Self-raising flour", 40, 3.50, 25.00, "kg"));
        ingredientsList.add(new LooseIngredients("Golden caster sugar", 27, 2.00, 25.00, "kg"));
        ingredientsList.add(new LooseIngredients("Light brown sugar", 40, 4.00, 25.00, "kg")); 
        ingredientsList.add(new LooseIngredients("Sweetened condensed milk",10, 1.99, 25, "L"));
        ingredientsList.add(new LooseIngredients("Evaporated milk",10, 1.99, 12, "L"));
        ingredientsList.add(new LooseIngredients("Chocolate chips", 2, 7.50, 25.00, "kg"));

        ingredientsList.add(new BoxedIngredients("Eggs",10, 1.99, 12));
        ingredientsList.add(new BoxedIngredients("Digestive biscuits",10, 1.99, 15));
        ingredientsList.add(new BoxedIngredients("Salted butter",15, 2.99, 12));
        ingredientsList.add(new BoxedIngredients("Unsalted butter",20, 2.99, 12));
        
        return ingredientsList;
    }

    public void DisplayIngredients(ArrayList<Ingredients> list)
    {
        for(int i = 0; i < list.size(); i++) 
        {
            System.out.println("Item: " + i);
            System.out.println(list.get(i).ToString());
        }
    }

    public void SearchIngredients()
    {
        System.out.println("Please enter the item you would like to search for: ");
        SetSearchTerm(userInput.nextLine().trim());
        for(int i = 0; i < list.size(); i++) 
        {
            if(list.get(i).GetName().contains(GetSearchTerm()) || list.get(i).GetName().contains(GetSearchTerm().toLowerCase()))
            {
                //SetSearchList(GetSearchList().add(list.get(i)));
                // true;
            }  
        }
        //print temp list or no matches found
        
    }

    public void AddIngredients()
    {
        //have validation to check ingredient is not there
        //have validation to check max capacity not exceeded
    }

    public void UseIngredients()
    {
        //search for ingredient
        //deduct amount - have validation to check its not going -ve
    }

}
