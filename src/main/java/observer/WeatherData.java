package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private float temp;
	private float hum;
	private float pres;
	private List<Observer> observers;
	
	public void setMeasurements(float temp, float hum, float pres) {
		setTemp(temp);
		setHum(hum);
		setPres(pres);
		measurementChanged();
	}
	
	private void measurementChanged() {
		notifyObserver();
	}
	
	@Override
	public boolean registerObserver(Observer observer) {
		return getObservers().add(observer);
	}

	@Override
	public boolean deleteObserver(Observer observer) {
		return getObservers().remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer obs : getObservers()) {
			obs.update(this);
		}
	}

	public List<Observer> getObservers() {
		if (observers == null) {
			observers = new ArrayList<>();
		}
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHum() {
		return hum;
	}

	public void setHum(float hum) {
		this.hum = hum;
	}

	public float getPres() {
		return pres;
	}

	public void setPres(float pres) {
		this.pres = pres;
	}

}
