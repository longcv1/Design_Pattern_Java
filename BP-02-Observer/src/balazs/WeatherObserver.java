package balazs;

public class WeatherObserver implements Observer {
	private int pressure;
	private int temprature;
	private int humidity;
	private Subject sub;
	
	public WeatherObserver(Subject sub) {
		this.sub = sub;
		this.sub.addObserver(this);
	}
	
	@Override
	public void update(int pressure, int temperature, int humidity) {
		this.pressure = pressure;
		this.temprature = temperature;
		this.humidity = humidity;
		showData();
	}
	
	private void showData() {
		System.out.println("Press: " + pressure + ", Tem: " + temprature + ", Hum: " + humidity);
	}
}
