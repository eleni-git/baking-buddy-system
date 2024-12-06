import java.util.Scanner;

public abstract class Ingredients
{
    public Scanner userInput = new Scanner(System.in);
    public ErrorHandling errorHandling = new ErrorHandling();
    public String name;
    public double quantity;
    public double costPerUnit;
    public int Id;

    //constructor
    public Ingredients(){}
    public Ingredients(String name, double quantity, double costPerUnit, int Id)
    {
        this.name = name;
        this.quantity = quantity;
        this.costPerUnit = costPerUnit;
        this.Id = Id;
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
    public int GetId()
    {
        return Id;
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
    public void SetId(int Id)
    {
        this.Id = Id;
    }

    //methods
    public abstract String ToString(); //overrides normal ToString method
    public abstract double GetMaximumCapacity();

    public void AddIngredients()
    {
        System.out.println("Enter the name of the item you would like to add: ");
        SetName(userInput.nextLine());
        System.out.println("Enter the quantity you would like to add: ");
        SetQuantity(errorHandling.CheckIfDoubleIngredients());
        System.out.println("Enter the cost per unit: ");
        SetCostPerUnit(errorHandling.CheckIfDoubleIngredients());       
    }


}