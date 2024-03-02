package bridge_pattern;

public class SupremePizza implements PizzaInterface{
	
	Topping myTopping;
	
	public SupremePizza(Topping myTopping) {
		this.myTopping = myTopping;
	}
	
	public void selectPizza() {
		System.out.print("Supreme Pizza Selected with ");
		myTopping.selectTopping();
	}
}
