package decorator_example2_old;

public class Main {

// we comment the main method here so it cannot interfere with the changes made in the other package new
//	public static void main(String[] args) {
//		order(new PizzaMargherita());
//		order(new PizzaHawaiian());
//		order(new PizzaPepperoni());
//	}
	
	public static void order(Pizza pizza) {
		System.out.println("You have ordered a " + pizza.getName() + 
				" pizza. The toppings are " + pizza.getToppings() + "." );
	}

}
