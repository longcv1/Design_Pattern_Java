package balazs;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
	int pressure;
	int temparature;
	int humidity;
	List<Observer> observerList;
	
	public WeatherStation() {
		this.observerList = new ArrayList<>();
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
	public void notifyAllObserver() {
		for(Observer o : observerList) {
			o.update(pressure, temparature, humidity);
		}
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
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
	
}
