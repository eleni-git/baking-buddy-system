public class LooseIngredients extends Ingredients
{
    public double maximumCapacity;
    public String unit;
    
    //constructor


    //getters and setters
    public double GetMaximumCapacity()
    {
        return maximumCapacity;
    }
    public String GetUnit()
    {
        return unit;
    }
    public void SetMaxCapacity(double maximumCapacity)
    {
        this.maximumCapacity = maximumCapacity;
    }
    public void SetUnit(String unit)
    {
        this.unit = unit;
    }


    
    public LooseIngredients(String name, double quantity, double costPerUnit, double maximumCapacity, String unit)
    {
        super(name, quantity, costPerUnit);
        this.maximumCapacity = maximumCapacity;
        this.unit = unit;
    }

    public String ToString()
    {
        return("Loose item: " + GetName() + "\nQuantity: " + GetQuantity() + "\nCost per " + GetUnit() + ": £" + GetCostPerUnit() +  "\nMaximum capacity: " + GetMaximumCapacity() + GetUnit() + "\n");
    }
}
