package factory_pattern;

//This is the Factory class. It decides what concerte class should be used for the given input
public class CarFactory {

    //Gets the type as a parameter
    public static FactoryInterface getModel(String type){
    	
    	System.out.println("ShowDetails running" + type);
        //Checks for the type and then returns the matching class instance as FactoryInterface type to promote loose coupling.
        if(type.equals("Benz")){
            return new CarModelBenz();
        } else if (type.equals("BMW")) {
            return new CarModelBMW();
        }else {
            throw new IllegalArgumentException("Invalid product type");
        }
    }
}