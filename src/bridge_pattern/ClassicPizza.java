package bridge_pattern;

public class ClassicPizza implements PizzaInterface{
	
	Topping myTopping;
	
	public ClassicPizza(Topping myTopping) {
		this.myTopping = myTopping;
	}
	
	public void selectPizza() {
		System.out.print("Classic Pizza Selected with ");
		myTopping.selectTopping();
	}
}
