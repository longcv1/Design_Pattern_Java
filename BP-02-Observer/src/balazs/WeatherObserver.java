package balazs;

public class WeatherObserver implements Observer {

	private int pressure;
	private int temparature;
	private int humidity;
	private Subject subject;
	
	public WeatherObserver(Subject sub) {
		this.subject = sub;
		this.subject.addObserver(this);
	}
	
	@Override
	public void update(int pressure, int temparature, int humidity) {
		this.pressure = pressure;
		this.temparature = temparature;
		this.humidity = humidity;
		showData();
	}

	private void showData() {
		System.out.println("Update OK");
	}
}
