package main_package;
import template_pattern.BaseAlgorithm;
import template_pattern.ChildAlgo_1;
import template_pattern.ChildAlgo_2;
/*
 * @author		- 	Thathsara Pramodya Thalangama
 * 
 * @description - 
 * 					This implementation demonstrates how "Template" design pattern works.
 * @Usage 		- 	Utilize the Template Method Pattern when you encounter a repetitive logic structure, but variations in the implementation depend on the specific objects utilizing that logic.
 *  		
 * */


public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		runTemplateDesign();
	
		
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

}
