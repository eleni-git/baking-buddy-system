package bakingbuddysystem;
import java.util.Scanner;

public class Conversions {
    public Scanner userInput = new Scanner(System.in);
    public String degreesFString;
    public String degreesCString;
    public String kilogramsString;
    public String gramsString;
    public String ouncesString;
    public double celcius;
    public double farenheit;
    public double kilograms;
    public double grams;
    public double ounces;

   //getters
    public String GetDegreesF()
    {
        return degreesFString;
    }
    public String GetDegreesC()
    {
        return degreesCString;
    } 
    public double GetFarenheit()
    {
        return farenheit;
    }
    public double GetCelcius()
    {
        return celcius;
    }

    public String GetKG()
    {
        return kilogramsString;
    }
    public String GetG()
    {
        return gramsString;
    }
    public String GetOZ()
    {
        return ouncesString;
    }
    public double GetKilograms()
    {
        return kilograms;
    }
    public double GetGrams()
    {
        return grams;
    }
    public double GetOunces()
    {
        return ounces;
    }

    //setters
    public void SetDegreesF(String degreesFString)
    {
        this.degreesFString = degreesFString;
    }
    public void SetDegreesC(String degreesCString)
    {
        this.degreesCString = degreesCString;
    }
    public void SetFarenheit(double farenheit)
    {
        this.farenheit = farenheit;
    }
    public void SetCelcius(double celcius)
    {
        this.celcius = celcius;
    }
    public void SetKG(String kilogramsString)
    {
        this.kilogramsString = kilogramsString;
    }
    public void SetG(String gramsString)
    {
        this.gramsString = gramsString;
    }
    public void SetOZ(String ouncesString)
    {
        this.ouncesString = ouncesString;
    }
    public void SetKilograms(double kilograms)
    {
        this.kilograms = kilograms;
    }
    public void SetGrams(double grams)
    {
        this.grams = grams;
    }
    public void SetOunces(double ounces)
    {
        this.ounces = ounces;
    }

    //Takes user input, calls error handling to ensure incorrect input does not cause an uncaught exception
    public void CelciusToFarenheit()
    {
        System.out.println("Enter degrees in celcius");
        SetDegreesC(userInput.nextLine());
        
        if (ErrorHandling.checkIfDouble(GetDegreesC()))
        {
            SetCelcius(Double.parseDouble(GetDegreesC()));
            System.out.println(GetCelcius() + " degrees celcius is " + CelciusToFarenheitCalculation(GetCelcius()) + " degrees farenheit");
        }

    }

    public void FarenheitToCelcius()
    {
        System.out.println("Enter degrees in farenheit");
        SetDegreesF(userInput.nextLine());
        
        if (ErrorHandling.checkIfDouble(GetDegreesF()))
        {
            SetFarenheit(Double.parseDouble(GetDegreesF()));
            System.out.println(GetFarenheit() + " degrees farenheit is " + FarenheitToCelciusCalculation(GetFarenheit()) + " degrees celcius");
        }
    }

    public void KilogramsToGramsConversion()
    {
        System.out.println("Enter weight in kilograms");
        SetKG(userInput.nextLine());
        
        if (ErrorHandling.checkIfDouble(GetKG()))
        {
            SetKilograms(Double.parseDouble(GetKG()));
            System.out.println(GetKilograms() + " kilograms is " + KilogramsToGramsCalculation(GetKilograms()) + " grams");
        }

    }

    public void GramsToKilogramsConversion()
    {
        System.out.println("Enter weight in grams");
        SetG(userInput.nextLine());
        
        if (ErrorHandling.checkIfDouble(GetG()))
        {
            SetGrams(Double.parseDouble(GetG()));
            System.out.println(GetGrams() + " grams is " + GramsToKilogramsCalculation(GetGrams()) + " kilograms");
        }
    }

    public void GramsToOuncesConversion()
    {
        System.out.println("Enter weight in grams");
        SetG(userInput.nextLine());
        
        if (ErrorHandling.checkIfDouble(GetG()))
        {
            SetGrams(Double.parseDouble(GetG()));
            System.out.println(GetGrams() + " grams is " + GramsToOuncesCalculation(GetGrams()) + " ounces");
        }
    }

    public void OuncesToGramsConversion()
    {
        System.out.println("Enter weight in ounces");
        SetOZ(userInput.nextLine());
        
        if (ErrorHandling.checkIfDouble(GetOZ()))
        {
            SetOunces(Double.parseDouble(GetOZ()));
            System.out.println(GetOunces() + " ounces is " + OuncesToGramsCalculation(GetOunces()) + " grams");
        }
    }


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
    public double KilogramsToGramsCalculation(double kilograms)
    {
        return kilograms*1000;
    }
    public double GramsToKilogramsCalculation(double grams)
    {
        return grams/1000;
    }
    public double GramsToOuncesCalculation(double grams)
    {
        return grams/28.35;
    }
    public double OuncesToGramsCalculation(double ounces)
    {
        return ounces*28.35;
    }
}
