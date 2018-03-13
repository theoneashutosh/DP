package observer;

public class WeatherStation {

	public static void main(String[] args) {
		
		WeatherData data = new WeatherData();
		CurrentCondition currentCondition = new CurrentCondition(data);
		
		data.setMeasurements(38.2f, 85.1f, 45.65f);
	}
}
