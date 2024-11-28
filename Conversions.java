import java.util.Scanner;

public class Conversions {
    public Scanner userInput = new Scanner(System.in);
    public String degreesF;
    public String degreesC;

    public String getDegreesF()
    {
        return degreesF;
    }
    public String getDegreesC()
    {
        return degreesF;
    } 


    public void CelciusToFarenheit()
    {
        System.out.println("Enter degrees in celcius");
        String trialDoublec = userInput.nextLine();
        
        if (ErrorHandling.checkIfDouble(trialDoublec))
        {
            double celcius = Double.parseDouble(trialDoublec);
            System.out.println(celcius + " degrees celcius is " + CelciusToFarenheitCalculation(celcius) + " degrees farenheit");
        }
        else
        {
            System.out.println("Error, please enter a valid decimal number");
            //TemperaturesMenu();
        }
    }

    public void FarenheitToCelcius()
    {
        System.out.println("Enter degrees in farenheit");
        String trialDoublef = userInput.nextLine();
        
        if (ErrorHandling.checkIfDouble(trialDoublef))
        {
            double farenheit = Double.parseDouble(trialDoublef);
            System.out.println(farenheit + " degrees farenheit is " + FarenheitToCelciusCalculation(farenheit) + " degrees celcius");
        }
        else
        {
            System.out.println("Error, please enter a valid decimal number");
            //menus.TemperaturesMenu();
        }
    }

    public void KilogramsToGramsConversion()
    {

    }

    public void GramsToKilogramsConversion()
    {

    }

    //public void







    public double CelciusToFarenheitCalculation(double celcius)
    {
        double farenheit = (celcius*9/5) + 32;
        return farenheit;
    }

    public double FarenheitToCelciusCalculation(double farenheit)
    {
        double celcius = (farenheit-32) * 5/9;
        return celcius;
    }
}
