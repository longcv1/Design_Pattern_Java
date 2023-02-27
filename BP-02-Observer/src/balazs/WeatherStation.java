package balazs;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
	private int pressure;
	private int temprature;
	private int humidity;
	private List<Observer> observerList;
	
	public WeatherStation() {
		observerList = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer o) {
		this.observerList.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		this.observerList.remove(o);
	}
	@Override
	public void notifyAllObservers() {
		for(Observer o : observerList) {
			o.update(pressure, temprature, humidity);
		}
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObservers();
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObservers();
	}
	public void setTemprature(int temprature) {
		this.temprature = temprature;
		notifyAllObservers();
	}
}
