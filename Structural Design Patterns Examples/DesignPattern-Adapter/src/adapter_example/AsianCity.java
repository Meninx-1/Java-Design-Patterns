package adapter_example;

public class AsianCity implements City {

	private String name;
	private double temperature;
	private boolean hasWeatherWarning;
	
	public AsianCity(String name, double temperature) {
		super();
		this.name = name;
		this.temperature = temperature;
		this.hasWeatherWarning = hasWeatherWarning;
	}

	public String getName() {
		return name;
	}


	public double getTemperature() {
		return temperature;
	}
	
	public String getTemperatureScale() {
		return "Celsius";
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public boolean getHasWeatherWarning() {
		return hasWeatherWarning;
	}

	public void setHasWeatherWarning(boolean hasWeatherWarning) {
		this.hasWeatherWarning = hasWeatherWarning;
	}
	
	
}
