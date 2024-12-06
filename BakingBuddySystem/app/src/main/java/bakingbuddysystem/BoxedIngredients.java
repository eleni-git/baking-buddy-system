package BakingBuddySystem.app.src.main.java.bakingbuddysystem;
public class BoxedIngredients extends Ingredients
{
    public int itemsPerBox;
    
     //constructors - The empty constructor allows an instance to be created without all the details, which is used in the AddIngredients() in the 
    //digital pantry
     public BoxedIngredients(){}
     public BoxedIngredients(String name, double quantity, double costPerUnit, int Id, int itemsPerBox)
     {
         super(name, quantity, costPerUnit, Id);
         this.itemsPerBox = itemsPerBox;
     }
    
    //getters and setters
    public int GetItemsPerBox()
    {
        return itemsPerBox;
    }
    @Override
    public double GetMaximumCapacity()
    {
        return -1;
    }
    public void SetItemsPerBox(int itemsPerBox)
    {
        this.itemsPerBox = itemsPerBox;
    }

    //Overrides the normal ToString() method to display and format the boxed ingredients for a better UX
    @Override
    public String ToString()
    {
        return("Id: " + GetId() + "\nBoxed item: " + GetName() + "\nQuantity: " + GetQuantity() + "\nCost per box: £" + GetCostPerUnit() +  "\nItems per box: " + GetItemsPerBox() + "\n");
    }
    
    //Extends the shared part of ingredients to collect the boxed specific properties to be able to add a new item to the digital pantry
    @Override
    public void AddIngredients()
    {
        super.AddIngredients();
        System.out.println("Enter the items per box: ");
        SetItemsPerBox(userInput.nextInt());
    }
}
