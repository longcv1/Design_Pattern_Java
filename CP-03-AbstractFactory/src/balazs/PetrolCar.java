package balazs;

public class PetrolCar implements AbstractFactoryCar {
@Override
public Car getCar(String type) {
	if(type.equals("PETROL_TOY")) {
		return new PetrolToy();
	} 
	return null;
}
}
