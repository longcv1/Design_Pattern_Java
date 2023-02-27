package balazs;

public class App {

	public static void main(String[] args) {
		System.out.println("==== OBSERVER PATTERN ====");
		WeatherStation station = new WeatherStation();
		WeatherObserver observer = new WeatherObserver(station);
		station.setTemprature(200);
		station.setHumidity(300);
		station.setPressure(323);
		station.setTemprature(600);
	}

}
