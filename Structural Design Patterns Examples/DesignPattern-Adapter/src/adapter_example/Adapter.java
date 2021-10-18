package adapter_example;

// This is the adapter class created to adapt cities with celsius temperature to be used in our class 
//hiearchy
public class Adapter implements City {
	
	City city;

	public Adapter(AsianCity city) {
		this.city = city;
	}

	public String getName() {
		return city.getName();
	}

	public double getTemperature() {
		double temperature = city.getTemperature();
		return temperature * 1.8 + 32;
	}

	public String getTemperatureScale() {
		return "Fahrenheit";
	}

	public boolean getHasWeatherWarning() {
		return city.getHasWeatherWarning();
	}

	public void setHasWeatherWarning(boolean hasWeatherWarning) {
		city.setHasWeatherWarning(hasWeatherWarning);
	}
	
	
}
