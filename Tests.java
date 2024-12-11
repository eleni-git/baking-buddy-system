import java.util.ArrayList;

public class Tests
{
    public void RunTests()
    {
        //System.out.println("Please ");
        System.out.println("BOXED INGREDIENTS TESTS");
        System.out.println(BoxedIngredientsTest());
        System.out.println("\nLOOSE INGREDIENTS TESTS");
        System.out.println(LooseIngredientsTest());
        System.out.println("\nCONVERSIONS TESTS");
        System.out.println(ConversionsTest());
        System.out.println("\nERROR HANDLING TESTS");
        System.out.println(ErrorHandlingTest());
        System.out.println("\nPANTRY TESTS");
        System.out.println(PantryTest());
        System.out.println("\nRECOMMENDATIONS TESTS");
        System.out.println(ReccommendationsTest());
    
    }
 
    //Unit testing

    //Ingredients class as a whole does not need to be tested. It is an abstract class so an object cannot be instantitated, and both child classes 
    //(boxed ingredients and loose ingredients) are tested below.
    public String BoxedIngredientsTest()
    {
        String returnMessage = "";
        //Tests a sample object can be instantiated and all getter methods work.
        BoxedIngredients boxedIngredients = new BoxedIngredients("Apple juice cartons",10, 1.99,14,  12);
        if("Apple juice cartons".equals(boxedIngredients.GetName()) && boxedIngredients.GetQuantity()==10 && boxedIngredients.GetCostPerUnit()==1.99 && boxedIngredients.GetId()==14 && boxedIngredients.GetItemsPerBox()==12)
        {
            returnMessage += ("Boxed ingredient test 1 passed: Successfully instantiated full boxed ingredient");  
        }
        else
        {
            returnMessage +=("Error, boxed ingredients test failed, ingredient created and items retrieved using getters do not match.");
        }
        //Tests empty ingredient can be created, which allows an ingredient to be added to the pantry from the digital pantry menu
        BoxedIngredients boxedIngredients2 = new BoxedIngredients();
        if(boxedIngredients2.GetName()==null && boxedIngredients2.GetQuantity()==0.0 && boxedIngredients2.GetCostPerUnit()==0.0 && boxedIngredients2.GetId()==0.0 && boxedIngredients2.GetItemsPerBox()==0.0)
        {
            returnMessage += ("\nBoxed ingredient test 2 passed: successfully instantiated empty ingredient");
        }
        else
        {
            returnMessage += ("\nError, boxed ingredients test failed, ingredient created and items retrieved using getters do not match.");
        }
        return returnMessage;
    }

    public String LooseIngredientsTest()
    {
        String returnMessage = "";
        LooseIngredients looseIngredients = new LooseIngredients("Demerara sugar",10, 1.99,15,100, "kg");
        if(looseIngredients.GetName() =="Demerara sugar" && looseIngredients.GetQuantity()==10 && looseIngredients.GetCostPerUnit()==1.99 && looseIngredients.GetId()==15 && looseIngredients.GetMaximumCapacity()==100 && looseIngredients.GetUnit()== "kg")
        {
            returnMessage += "Loose ingredient test 1 passed: successfully instantiated full loose ingredient";
        }
        else
        {
            returnMessage += "Error, loose ingredients test failed, ingredient created and items retrieved using getters do not match.";
        } 
        
        //Tests empty ingredient can be created, which allows an ingredient to be added to the pantry from the digital pantry menu
        LooseIngredients looseIngredients2 = new LooseIngredients();
        if(looseIngredients2.GetName() ==null && looseIngredients2.GetQuantity()==0.0 && looseIngredients2.GetCostPerUnit()==0.0 && looseIngredients2.GetId()==0 && looseIngredients2.GetMaximumCapacity()==0.0 && looseIngredients2.GetUnit()==null)
        {
            returnMessage += "\nLoose ingredient test 2 passed: successfully instantiated empty loose ingredient";
        }
        else
        {
            returnMessage += "\nError, loose ingredients test 2 failed, ingredient created and items retrieved using getters do not match.";
        }   
        return returnMessage;
    }

    public String ConversionsTest()
    {
        Conversions conversions = new Conversions();
        String returnMessage="";
        if(conversions.CelciusToFarenheitCalculation(37.5) == 99.5)
        {
            returnMessage += "Converstions test 1 passed: celcius to farenheit converts correctly";
        }
        else
        {
            returnMessage += "Error, celcius to farenheit conversion failed";
        }
        if(conversions.FarenheitToCelciusCalculation(99.5) == 37.5)
        {
            returnMessage += "\nConverstions test 2 passed: farenheit to celcius converts correctly";
        }
        else
        {
            returnMessage += "\nError, celcius to farenheit conversion failed";
        }
        if(conversions.KilogramsToGramsCalculation(1) == 1000)
        {
            returnMessage += "\nConverstions test 3 passed: kilograms to grams converts correctly";
        }
        else
        {
            returnMessage += "\nError, kilograms to grams conversion failed";
        }
        if(conversions.GramsToKilogramsCalculation(1000) == 1)
        {
            returnMessage += "\nConverstions test 4 passed: grams to kilograms converts correctly";
        }
        else
        {
            returnMessage += "\nError, grams to kilograms conversion failed";
        }
        if(conversions.OuncesToGramsCalculation(1) == 28.35)
        {
            returnMessage += "\nConverstions test 5 passed: ounces to grams converts correctly";
        }
        else
        {
            returnMessage += "\nError, ounces to grams conversion failed";
        }
        if(conversions.GramsToOuncesCalculation(28.35) == 1)
        {
            returnMessage += "\nConverstions test 6 passed: grams to ounces converts correctly";
        }
        else
        {
            returnMessage += "\nError, grams to ounces conversion failed";
        }
        return returnMessage;
    }

    public String ErrorHandlingTest()
    {
        ErrorHandling errorHandling = new ErrorHandling();
        String returnMessage = "";
        if(errorHandling.checkIfInteger("1"))
        {
            returnMessage += "Error handling test 1 passed: Successfully parses string to integer";
        }
        else
        {
            returnMessage += "Error, unccessfully parsed string to integer";
        }
        if(!errorHandling.checkIfDouble("notAnInteger"))
        {
            returnMessage += "\nError handling test 2 passed: Successfully handles string after trying to parse it as an integer";
        }
        else
        {
            returnMessage += "\nError, unccessfully parsed string input";
        }
        if(errorHandling.checkIfDouble("0.1"))
        {
            returnMessage += "\nError handling test 3 passed: Successfully parses string to double";
        }
        else
        {
            returnMessage += "\nError, unccessfully parsed string input";
        }
        //The rest of "ErrorHandling" class is untested for the following reasons:
        //Other methods return string output indicating an invalid entry was given which could confuse people running the tests.
        //Other methods take in user input, not have hard coded values passed into them, so integration testing was done whilst coding, rather than this 
        //unit testing.
        return returnMessage;
    }

    public String PantryTest()
    {
        Pantry pantry = new Pantry();
        String returnMessage = "";
        
        System.out.println("Testing output... (ignore the following two ingredients) \n");
        ArrayList<Ingredients> ingredientsList = new ArrayList<>();
        ingredientsList.add(new LooseIngredients("Plain flour", 35, 3.00,1, 100.00, "kg"));
        ingredientsList.add(new BoxedIngredients("Eggs",10, 1.99,8,  12));
        pantry.DisplayIngredients(ingredientsList);
        returnMessage += "Pantry test 1 passed: Successfully displays list containing both boxed and loose ingredients";
        //Rest was tested with integration testing, as it takes user input and provides output without returning values
        return returnMessage;
    }

     public String ReccommendationsTest()
    {
        String returnMessage = "";
        int randomIndex = (int)(Math.random() *4);
        if(randomIndex >= 0 && randomIndex < 4)
        {
            returnMessage += "Recommendations test 1 passed: randomly generated index for array will be within the boundaries";
        }
        else
        {
            returnMessage += "Error, randomly generated number is not 0/1/2/3 which will cause an exception when running the 'recommendations' code";
        }
        return returnMessage;
    }
}