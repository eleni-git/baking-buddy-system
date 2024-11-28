

public class Ingredients
{
    public String name;
    public String trialUnits;
    public double quantity;

    public enum Units
    {
        Kilograms,
        Litres,
        Boxed12;
    }

    //getters and setters

    public String getName()
    {
        return name;
    }
    public double getQuantity()
    {
        return quantity;
    }
    // public int getType()
    // {
    //     return Type;
    // }
    
    public Ingredients(String name, String trialUnits, double quantity)
    {
        this.name = name;
        this.trialUnits = trialUnits;
        this.quantity = quantity;
    }

    //pre-populate database?
    //method to display all ingrideitns
    //method to search for 
    //extends keyword for fresh ingredients?
    

}