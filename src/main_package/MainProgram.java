package main_package;
//Template pattern imports
import template_pattern.ChildAlgo_1;
import template_pattern.ChildAlgo_2;

//Singleton pattern imports
import singleton_pattern.SingletonClass;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		runTemplateDesign();
		
		runSingletonDesign();
	
		
	}
	
	static void runTemplateDesign() {
		
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
	static void runSingletonDesign() {
		
		//Calling first time
		System.out.println("Calling first time :- \n");
		SingletonClass.getInstance();
		
		//Calling second time
		System.out.println("Calling second time :- \n");
		SingletonClass.getInstance();		
	}

}
