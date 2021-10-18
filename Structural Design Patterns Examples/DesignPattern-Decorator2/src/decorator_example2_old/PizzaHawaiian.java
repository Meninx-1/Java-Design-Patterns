package decorator_example2_old;

import java.util.ArrayList;

public class PizzaHawaiian implements Pizza {
	
	static ArrayList toppings = new ArrayList<String>();
	static String name = "Hawaiian";
	
	public PizzaHawaiian() {
		toppings.add("cheese");
		toppings.add("tomato");
		toppings.add("ham");
		toppings.add("pineapple");
	}
	
	public ArrayList getToppings() {
		return toppings;
	}
	
	public String getName() {
		return name;
	}
}
