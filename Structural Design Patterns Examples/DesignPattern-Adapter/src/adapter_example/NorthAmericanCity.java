package adapter_example;

public class NorthAmericanCity  implements City {
	
	private String name;
	private double temperature;
	private boolean hasWeatherWarning;
	
	public NorthAmericanCity(String name, double temperature) {
		super();
		this.name = name;
		this.temperature = temperature;
	}

	public String getName() {
		return name;
	}

	public double getTemperature() {
		return temperature;
	}
	
	public String getTemperatureScale() {
		return "Fahrenheit";
	}

	public boolean getHasWeatherWarning() {
		return hasWeatherWarning;
	}

	public void setHasWeatherWarning(boolean hasWeatherWarning) {
		this.hasWeatherWarning = hasWeatherWarning;
	}
	
	
}
