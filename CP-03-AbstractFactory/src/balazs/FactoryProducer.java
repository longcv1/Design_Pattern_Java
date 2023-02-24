package balazs;

public class FactoryProducer {
	public static AbstractFactoryCar getFactory(String factory) {
		if(factory.equals("ELECTRIC")) {
			return new ElectricCar();
		} else if(factory.equals("PETROL")) {
			return new PetrolCar();
		}
		
		return null;
	}
}
