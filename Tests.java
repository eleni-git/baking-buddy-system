public class Tests
{
    public void RunTests()
    {
        System.out.println(BoxedIngredientsTest());
        System.out.println(LooseIngredientsTest());
    
    }
    
    public String BoxedIngredientsTest()
    {
        String returnMessage = "Error, boxed ingredients test failed, ingredient created and items retrieved using getters do not match.";
        BoxedIngredients boxedIngredients = new BoxedIngredients("Apple juice cartons",10, 1.99,14,  12);
        if(boxedIngredients.GetName() =="Apple juice cartons" && boxedIngredients.GetQuantity()==10 && boxedIngredients.GetCostPerUnit()==1.99 && boxedIngredients.GetId()==14 && boxedIngredients.GetItemsPerBox()==12)
        {
            returnMessage = "Boxed ingredient tests passed";
        }
        return returnMessage;
    }

    public String LooseIngredientsTest()
    {
        String returnMessage = "Error, loose ingredients test failed, ingredient created and items retrieved using getters do not match.";
        LooseIngredients looseIngredients = new LooseIngredients("Demerara sugar",10, 1.99,15,100, "kg");
        if(looseIngredients.GetName() =="Demerara sugar" && looseIngredients.GetQuantity()==10 && looseIngredients.GetCostPerUnit()==1.99 && looseIngredients.GetId()==15 && looseIngredients.GetMaximumCapacity()==100 && looseIngredients.GetUnit()== "kg")
        {
            returnMessage = "Loose ingredient tests passed";
        }
        return returnMessage;
        
    }


}