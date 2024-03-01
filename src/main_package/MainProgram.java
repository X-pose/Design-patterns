package main_package;
//Template pattern imports
import template_pattern.ChildAlgo_1;
import template_pattern.ChildAlgo_2;

import java.util.Scanner;

import factory_pattern.CarFactory;
//Singleton pattern imports
import factory_pattern.FactoryInterface;
import singleton_pattern.SingletonClassEager;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		runTemplateDesign();
		
		runSingletonDesign();

		runFactoryMethod();
	}
	
	private static void runTemplateDesign() {
		
		//Creating an object from childAlgo_1 to run the algo
		ChildAlgo_1 newChild_1 = new ChildAlgo_1();
		System.out.println("Running Algorithm using childAlgo_1 : - \n");
		newChild_1.runAlgo();
		
		//Creating an object from childAlgo_2 to run the algo
		ChildAlgo_2 newChild_2 = new ChildAlgo_2();
		System.out.println("Running Algorithm using childAlgo_2 : - \n");
		newChild_2.runAlgo();
		
	}
	
	
	
	/*
	 * This function should first create a new singleton instance and then when called again it should only return the already created instance*/
	private static void runSingletonDesign() {
		
		//Calling first time
		System.out.println("Calling first time :- \n");
		SingletonClassEager.getInstance();
		
		//Calling second time
		System.out.println("Calling second time :- \n");
		SingletonClassEager.getInstance();		
	}

	private static void runFactoryMethod(){
		Scanner sc = new Scanner(System.in);
		String type;

		//Getting the type from runtime
		System.out.println("Choose Car Model(Benz/BMW)");
		type = sc.next();


		//Getting the correct car object according to the given type
		FactoryInterface car = CarFactory.getModel(type);
		
		//showing details
		car.opShowDetails();

		//Closing the scanner object to avoid resource leaks
		sc.close();

	}

}
