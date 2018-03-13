package observer;

public class CurrentCondition implements Observer {

	private Subject weatherdata;
	
	public CurrentCondition(Subject weatherdata) {
		this.weatherdata = weatherdata;
		weatherdata.registerObserver(this);
	}
	
	@Override
	public void update(WeatherData data) {
		System.out.println("Temp..... " + data.getTemp());
		System.out.println("Humidity..... " + data.getHum());
		System.out.println("Pressure..... " + data.getPres());
	}


}
