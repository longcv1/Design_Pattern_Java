package lesson01;

public class CarFactory {

	public static Car getTypeCar(String type) {
		switch (type.toUpperCase()) {
			case "TOY":
				return new ToyotaCar();
			case "KIA":
				return new KiaCar();
			case "AUDI":
				return new AudiCar();
		}
		
		return null;
	}
}
