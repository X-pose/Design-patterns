package template_pattern;

public abstract class BaseAlgorithm {
	
	
	//This method executes the steps of algo
	void runAlgo() {
		step1();
		step2();
		step3();
		step4();
	}
	
	void step1() {
		
		System.out.printf("Step 1 is running - This is step 1 of the base algorithm and it's common\n\n");
		return;
	}
	
	//Abstract functions - use this when u have different implementations for the same step
	abstract void step2();
	abstract void step3();
	
	void step4() {
		System.out.printf("Step 4 is running - This is the last step of the base algorithm and it's common\n\n");
		return;
	}
}
