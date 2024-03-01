package factory_pattern;

//These concerete classes are the ones that impliments interface for each specified objects / classes
public class CarModelBMW implements FactoryInterface{
    //Attributes comes here
    String manufacture = "BMW";

    //Implimented interface
    public void opShowDetails(){
        System.out.println("This car is manufactured by : " + manufacture);
    }
}