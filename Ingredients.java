import java.util.Scanner;

//Ingredients is an abstract class are there are no 'Ingredients', but the two sub types of ingredients share common features
public abstract class Ingredients
{
    public Scanner userInput = new Scanner(System.in);
    public ErrorHandling errorHandling = new ErrorHandling();
    public String name;
    public double quantity;
    public double costPerUnit;
    public int Id;

    //constructors - The empty constructor allows an instance to be created without all the details, which is used in the AddIngredients() in the 
    //digital pantry
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

    //Both types of ingredients use this as a base, and extend it using 'super'
    //This method is to add a new ingredient to the digital pantry, taking user input on the details of the ingredient they would like to add
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