


public class BoxedIngredients extends Ingredients 
{
    public int itemsPerBox;
    
    //getters and setters
    public int GetItemsPerBox()
    {
        return itemsPerBox;
    }
    public void SetItemsPerBox(int itemsPerBox)
    {
        this.itemsPerBox = itemsPerBox;
    }
    public double GetMaximumCapacity()
    {
        return -1;
    }

    //constructor
    public BoxedIngredients()
    {   
    }
    public BoxedIngredients(String name, double quantity, double costPerUnit, int Id,int itemsPerBox)
    {
        super(name, quantity, costPerUnit, Id);
        this.itemsPerBox = itemsPerBox;
    }



    public String ToString()
    {
        return("ID: " + GetId() +"\nBoxed item: " + GetName() + "\nQuantity: " + GetQuantity() + "\nCost per box: £" + GetCostPerUnit() +  "\nItems per box: " + GetItemsPerBox() + "\n");
    }

    public void AddIngredients()
    {
        super.AddIngredients();
        System.out.println("Enter the items per box: ");
        SetItemsPerBox(userInput.nextInt());
    }
}
