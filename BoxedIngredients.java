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


    //constructor
    public BoxedIngredients(String name, double quantity, double costPerUnit, int itemsPerBox)
    {
        super(name, quantity, costPerUnit);
        this.itemsPerBox = itemsPerBox;
    }

    public String ToString()
    {
        return("Boxed item: " + GetName() + "\nQuantity: " + GetQuantity() + "\nCost per box: £" + GetCostPerUnit() +  "\nItems per box: " + GetItemsPerBox() + "\n");
    }
}
