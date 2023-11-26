package template_pattern;

/*
 * @author		- 	Thathsara Pramodya Thalangama
 * 
 * @description - 
 * 					This implementation demonstrates how "Template" design pattern works.
 * @Usage 		- 	Utilize the Template Method Pattern when you encounter a repetitive logic structure, but variations in the implementation depend on the specific objects utilizing that logic.
 *  		
 * */

public abstract class BaseAlgorithm {
	
	
	//This method executes the steps of algo
	public void runAlgo() {
		step1();
		step2();
		step3();
		step4();
	}
	
	void step1() {
		
		System.out.printf("Step 1 is running from baseAlgo\n\n");
		return;
	}
	
	//Abstract functions - use this when u have different implementations for the same step
	abstract void step2();
	abstract void step3();
	
	void step4() {
		System.out.printf("Step 4 is running from baseAlgo\n\n\n\n");
		return;
	}
}
