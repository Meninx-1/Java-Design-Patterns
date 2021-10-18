package adapter_example;

public class Main {

	public static void main(String[] args) {
		WeatherWarnings weatherWarnings = new WeatherWarnings();
		
		NorthAmericanCity chicago = new NorthAmericanCity("Chicago", 16);
		weatherWarnings.postWarning(chicago);
	
		NorthAmericanCity phoenix = new NorthAmericanCity("Phoenix", 104);
		weatherWarnings.postWarning(phoenix);
	
		NorthAmericanCity portland = new NorthAmericanCity("Portland", 70);
		weatherWarnings.postWarning(portland);
	
		AsianCity bangkok = new AsianCity("Bangkok", 50);
		
		// This code is wrong because it doesn't show a warning as the temperature is in celcius and not 
		//Fahrenheit that's why we need an adapter
		// weatherWarnings.postWarning(bangkok); 
		
		Adapter adapter = new Adapter(bangkok);		
		weatherWarnings.postWarning(adapter);
	}
}
