public abstract class Ingredients
{
    public String name;
    public double quantity;
    public double costPerUnit;

    //constructor
    public Ingredients(String name, double quantity, double costPerUnit)
    {
        this.name = name;
        this.quantity = quantity;
        this.costPerUnit = costPerUnit;
    }

    //getters and setters

    public String GetName()
    {
        return name;
    }
    public double GetQuantity()
    {
        return quantity;
    }
    public double GetCostPerUnit()
    {
        return costPerUnit;
    }

    public void SetName(String name)
    {
        this.name = name;
    }
    public void SetQuantity(double quantity)
    {
        this.quantity = quantity;
    }
    public void SetCostPerUnit(double costPerUnit)
    {
        this.costPerUnit = costPerUnit;
    }

    //methods
    public abstract String ToString(); //overrides normal ToString method
       
    //public abstract SearchIngredients();
    //public abstract AddIngredients();
    //public abstract UseIngredients();
    


}