package balazs;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
<<<<<<< HEAD
	int pressure;
	int temparature;
	int humidity;
	List<Observer> observerList;
	
	public WeatherStation() {
		this.observerList = new ArrayList<>();
=======
	private int pressure;
	private int temprature;
	private int humidity;
	private List<Observer> observerList;
	
	public WeatherStation() {
		observerList = new ArrayList<>();
>>>>>>> b62cf0b4ca2d55cd153e789fe69f1e28dae7c9b9
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
<<<<<<< HEAD
	public void notifyAllObserver() {
		for(Observer o : observerList) {
			o.update(pressure, temparature, humidity);
=======
	public void notifyAllObservers() {
		for(Observer o : observerList) {
			o.update(pressure, temprature, humidity);
>>>>>>> b62cf0b4ca2d55cd153e789fe69f1e28dae7c9b9
		}
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
<<<<<<< HEAD
		notifyAllObserver();
	}
	public void setTemparature(int temparature) {
		this.temparature = temparature;
		notifyAllObserver();
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObserver();
	}
	
	
=======
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
>>>>>>> b62cf0b4ca2d55cd153e789fe69f1e28dae7c9b9
}
