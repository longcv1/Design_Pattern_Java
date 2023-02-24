package balazs;

public class App {

	public static void main(String[] args) {
		AbstractFactoryCar absCar = FactoryProducer.getFactory("PETROL");
		absCar.getCar("PETROL_TOY").show();
		
	}

}
