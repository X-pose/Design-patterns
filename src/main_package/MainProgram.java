package main_package;
//Template pattern imports
import template_pattern.ChildAlgo_1;
import template_pattern.ChildAlgo_2;

import java.util.Scanner;

import command_pattern.Light;
import command_pattern.RemoteController;
import command_pattern.TurnOffCommand;
import command_pattern.TurnOnCommand;
import factory_pattern.CarFactory;
//Singleton pattern imports
import factory_pattern.FactoryInterface;
import singleton_pattern.SingletonClassEager;
import bridge_pattern.CheeseTopping;
import bridge_pattern.ClassicPizza;
import bridge_pattern.HamTopping;
import bridge_pattern.PizzaInterface;
import bridge_pattern.SupremePizza;
import bridge_pattern.Topping;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		runTemplateDesign();
		
		runSingletonDesign();

		runFactoryMethod();
		
		runCommandMethod();
		
		runBridge();
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
	
	private static void runCommandMethod() {
		 // Create Receiver
        Light light = new Light();

        // Create Commands
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);

        // Create Invoker
        RemoteController remoteControl = new RemoteController();

        // Associate Commands with Invoker
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton(); // Light is on

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton(); // Light is off
	}
	
	
	private static void runBridge() {
		
		//Creating a cheeseTopping object
		Topping cheeseTopping = new CheeseTopping();
		
		//Creating a supreme pizza with cheese topping.
		PizzaInterface supremePizzaWithCheeseTopping = new SupremePizza(cheeseTopping);
		
		supremePizzaWithCheeseTopping.selectPizza();
		
		
		Topping hamTopping = new HamTopping();
		
		PizzaInterface ClassicPizzaWithHamTopping = new ClassicPizza(hamTopping);
		
		ClassicPizzaWithHamTopping.selectPizza();
	}

}
