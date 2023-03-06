package balazs;

public class App {

	public static void main(String[] args) {
		System.out.println("==== OBSERVER PATTERN ====");
		WeatherStation station = new WeatherStation();
		new WeatherObserver(station);
		station.setPressure(30);
		station.setTemparature(32);
		station.setHumidity(70);
	}

}
