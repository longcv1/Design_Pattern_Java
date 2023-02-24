package balazs;

public class ElectricCar implements AbstractFactoryCar {
	@Override
	public Car getCar(String type) {
		if(type.equals("FORD")) {
			return new ElectricFord();
		} else if(type.equals("KIA")) {
			return new ElectricKia();
		}
		
		return null;
	}
}
