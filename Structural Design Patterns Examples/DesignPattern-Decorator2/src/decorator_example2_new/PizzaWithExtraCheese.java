package decorator_example2_new;

import java.util.ArrayList;

//Decorator Class
public class PizzaWithExtraCheese implements Pizza {

	ArrayList toppings;
	Pizza pizza;
	
	public PizzaWithExtraCheese(Pizza pizza) {
		this.pizza = pizza;
		toppings = pizza.getToppings();
		toppings.add("extra cheese");
	}
	
	public ArrayList getToppings() {
		return toppings;
	}
	
	public String getName() {
		return pizza.getName();
	}
	
}
