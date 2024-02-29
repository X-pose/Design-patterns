package singleton_pattern;

/*
 * @author		- 	Thathsara Pramodya Thalangama
 *
 * @Category    -   Creational pattern
 * 
 * @description - This implementation demonstrates how "Singleton" design pattern works.
 * 
 * @Usage 		- 	Utilize the Singleton Pattern when you need to ensure that only one object of that class should be created.
 * 					For an example, use this pattern in resources heavy object such as database connections. In here if you're not sure whether this singleton is gonna be used
 *
 * @Type 		- 	Lazy initialization.
 *  		
 * */

public class SingletonClassLazy {

	private SingletonClassLazy();
	
	//Declare a private variable of the same class type to store the object instance
	private static SingletonClassLazy  instanceObj = null;
	
	//Add other variables such as database URI and other config data

	//This getFunction should be the only method that allows other objects to access this object. Synchronized for thread safety
	public static synchronized SingletonClassLazy getInstance() {
		
		//Lazy initialization: create the instance only if it hasn't been created yet
		if(instanceObj == null) {
			
			instanceObj = new SingletonClassLazy();
			System.out.println("New singleton instance created!\n\n");
		}
		
		System.out.println("Returning singleton instance from SingletonClassLazy\n\n");
		return instanceObj;
	}
	
	//Add other functions to support relevant business logic

}
