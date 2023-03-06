package lesson01;

public class App {

	public static void main(String[] args) {
		Car toyCar = CarFactory.getTypeCar("TOY");
		toyCar = new Builder(toyCar)
				.buildName("TOY")
				.buildEngine("ELECTRIC")
				.buildSeat(7)
				.build();
		toyCar.showInfo();
		
		Car KiaCar = CarFactory.getTypeCar("KIA");
		KiaCar = new Builder(KiaCar)
				.buildName("KIA")
				.buildEngine("PETROL")
				.buildSeat(2)
				.build();
		KiaCar.showInfo();
		
		Car AudiCar = CarFactory.getTypeCar("audi");
		AudiCar = new Builder(AudiCar)
					.buildName("AUDI LUXURY CAR")
					.buildEngine("HYBRID")
					.buildSeat(5)
					.build();
		AudiCar.showInfo();
	}

}
