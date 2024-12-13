public class LooseIngredients extends Ingredients
{
    public double maximumCapacity;
    public String unit;
    
    //constructors - The empty constructor allows an instance to be created without all the details, which is used in the AddIngredients() in the 
    //digital pantry
    public LooseIngredients(){}
    public LooseIngredients(String name, double quantity, double costPerUnit, int Id, double maximumCapacity, String unit)
    {
        super(name, quantity, costPerUnit, Id);
        this.maximumCapacity = maximumCapacity;
        this.unit = unit;
    }

    //getters and setters
    @Override
    public double GetMaximumCapacity()
    {
        return maximumCapacity;
    }
    public String GetUnit()
    {
        return unit;
    }
    public void SetMaximumCapacity(double maximumCapacity)
    {
        this.maximumCapacity = maximumCapacity;
    }
    public void SetUnit(String unit)
    {
        this.unit = unit;
    }

    //Overrides the normal ToString() method to display and format the boxed ingredients for a better UX
    @Override
    public String ToString()
    {
        return("ID: " + GetId() + "\nLoose item: " + GetName() + "\nQuantity: " + GetQuantity() + "\nCost per " + GetUnit() + ": £" + GetCostPerUnit() +  "\nMaximum capacity: " + GetMaximumCapacity() + GetUnit() + "\n");
    }

    //Extends the AddIngredients method to take user input specifically for instantiating a new loose ingredient
    @Override
    public void AddIngredients()
    {
        super.AddIngredients();
        System.out.println("Enter the unit type (e.g. kg, l): ");
        SetUnit(userInput.nextLine());
        System.out.println("Enter the maximum storage capacity: ");
        SetMaximumCapacity(errorHandling.CheckIfDoubleIngredients());
    }

}
